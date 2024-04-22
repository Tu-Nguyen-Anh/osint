package com.ncsgroup.profiling.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import static com.ncsgroup.profiling.constanst.ProfilingConstants.CommonConstants.ENCODING_UTF_8;
import static com.ncsgroup.profiling.constanst.ProfilingConstants.CommonConstants.MESSAGE_SOURCE;

@Configuration
public class MessageSourceConfiguration {

  @Bean
  public MessageSource messageSource() {
    var messageSource = new ReloadableResourceBundleMessageSource();
    messageSource.setBasename(MESSAGE_SOURCE);
    messageSource.setDefaultEncoding(ENCODING_UTF_8);
    return messageSource;
  }

}
