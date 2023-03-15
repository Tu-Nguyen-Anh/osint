package com.ncsgroup.profiling.security;

import com.ncsgroup.profiling.filter.JwtAuthenticationFilter;
import com.ncsgroup.profiling.security.error.UnAuthenticationCustomHandler;
import com.ncsgroup.profiling.security.error.UnAuthorizationCustomHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

  private final JwtAuthenticationFilter jwtAuthenticationFilter;
  private final UnAuthenticationCustomHandler unAuthenticationCustomHandler;
  private final UnAuthorizationCustomHandler unAuthorizationCustomHandler;


  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
          .csrf().disable()
          .authorizeHttpRequests()
          .antMatchers("/api/v1/**")
          .permitAll()
          .anyRequest().authenticated()
          .and()
          .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
          .exceptionHandling()
          .accessDeniedHandler(unAuthorizationCustomHandler)
          .authenticationEntryPoint(unAuthenticationCustomHandler)
          .and().sessionManagement()
          .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
          .and().build();
  }
}
