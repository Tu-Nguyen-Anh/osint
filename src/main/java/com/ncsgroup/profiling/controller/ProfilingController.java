package com.ncsgroup.profiling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api/v1/message")
@RequiredArgsConstructor
public class ProfilingController {
  private final MessageSource messageSource;

  @GetMapping
  public String checkConnection() {
    return messageSource.getMessage("profiling.welcome", null, new Locale("vi"));
  }
}
