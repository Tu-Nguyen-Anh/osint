package com.ncsgroup.profiling.exception.base;

import java.util.Map;

import static com.ncsgroup.profiling.constanst.ProfilingConstants.CommonConstants.BLANK_MESSAGE;
import static com.ncsgroup.profiling.constanst.ProfilingConstants.MessageException.DEFAULT_CODE_SERVER_ERROR;
import static com.ncsgroup.profiling.exception.base.StatusConstants.SERVER_ERROR;

public class InternalServerError extends BaseException{
  public InternalServerError(String code, String message, Map<String, String> params) {
    super(code, message, SERVER_ERROR, params);
  }

  public InternalServerError() {
    super(DEFAULT_CODE_SERVER_ERROR, BLANK_MESSAGE, SERVER_ERROR, null);
  }

  public InternalServerError(String message) {
    super(DEFAULT_CODE_SERVER_ERROR, message, SERVER_ERROR, null);
  }
}
