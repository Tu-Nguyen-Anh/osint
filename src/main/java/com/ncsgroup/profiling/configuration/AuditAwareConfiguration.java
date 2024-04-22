package com.ncsgroup.profiling.configuration;

import com.ncsgroup.profiling.configuration.auditor.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class AuditAwareConfiguration {
  @Bean
  public AuditorAware<String> auditorProvider() {return new AuditorAwareImpl();}
}
