package com.ncsgroup.profiling.controller.advice;

import com.ncsgroup.profiling.data.dto.response.Error;
import com.ncsgroup.profiling.data.dto.response.ResponseGeneral;
import com.ncsgroup.profiling.exception.base.BaseException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class ProfilingAdviceException {
  private final MessageSource messageSource;

  @ExceptionHandler(value = {BaseException.class})
  public ResponseEntity<ResponseGeneral<Error>> handleFinanceBaseException(
        BaseException ex,
        WebRequest webRequest
  ) {
    return ResponseEntity
          .status(ex.getStatus())
          .body(getError(ex.getStatus(), ex.getCode(), webRequest.getLocale(), ex.getParams()));
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ResponseGeneral<Error>> handleValidationExceptions(
        MethodArgumentNotValidException exception) {
    log.error("(handleValidationExceptions)exception: {}", exception.getMessage());
    Map<String, String> errors = new HashMap<>();
    exception
          .getBindingResult()
          .getAllErrors()
          .forEach(error -> {
            errors.put(((FieldError) error).getField(), error.getDefaultMessage());
          });
    log.error("(handleValidationExceptions) {}", errors);
    return ResponseEntity
          .status(HttpStatus.BAD_REQUEST)
          .body(getError(HttpStatus.BAD_REQUEST.value(), null, errors));
  }

  private ResponseGeneral<Error> getError(int status, String code, Map<String, String> params) {
    return ResponseGeneral.of(
          status,
          HttpStatus.valueOf(status).getReasonPhrase(),
          Error.of(code, params)
    );
  }

  private ResponseGeneral<Error> getError(int status, String code, Locale locale, Map<String, String> params) {
    return ResponseGeneral.of(
          status,
          HttpStatus.valueOf(status).getReasonPhrase(),
          Error.of(code, getMessage(code, locale, params))
    );
  }

  private String getMessage(String code, Locale locale, Map<String, String> params) {
    var message = getMessage(code, locale);
    if (params != null && !params.isEmpty()) {
      for (var param : params.entrySet()) {
        message = message.replace(getMessageParamsKey(param.getKey()), param.getValue());
      }
    }
    return message;
  }

  private String getMessage(String code, Locale locale) {
    try {
      return messageSource.getMessage(code, null, locale);
    } catch (Exception ex) {
      return code;
    }
  }

  private String getMessageParamsKey(String key) {
    return "%" + key + "%";
  }
}
