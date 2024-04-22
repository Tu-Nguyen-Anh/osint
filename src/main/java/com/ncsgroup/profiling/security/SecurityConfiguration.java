package com.ncsgroup.profiling.security;

import com.ncsgroup.profiling.filter.JwtAuthenticationFilter;
import com.ncsgroup.profiling.security.error.UnAuthenticationCustomHandler;
import com.ncsgroup.profiling.security.error.UnAuthorizationCustomHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import static com.ncsgroup.profiling.constanst.ProfilingConstants.AuthConstant.MATCHER_ADMIN_API;
import static com.ncsgroup.profiling.constanst.ProfilingConstants.AuthConstant.MATCHER_USER_API;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final UnAuthenticationCustomHandler unAuthenticationCustomHandler;
    private final UnAuthorizationCustomHandler unAuthorizationCustomHandler;

    @Bean
    public SecurityFilterChain securityFilterChainUsersAPI(HttpSecurity httpSecurity) throws Exception {
        sharedSecurityConfiguration(httpSecurity);
        httpSecurity
                .securityMatcher(MATCHER_USER_API)
                .authorizeHttpRequests(auth -> {
                    auth.anyRequest().authenticated();
                })
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .exceptionHandling(exception -> exception
                        .authenticationEntryPoint(unAuthenticationCustomHandler)
                        .accessDeniedHandler(unAuthorizationCustomHandler));
        return httpSecurity.build();
    }

    @Bean
    public SecurityFilterChain securityFilterChainAdminsAPI(HttpSecurity httpSecurity) throws Exception {
        sharedSecurityConfiguration(httpSecurity);
        httpSecurity
                .securityMatcher(MATCHER_ADMIN_API)
                .authorizeHttpRequests(auth -> {
                    auth.anyRequest().permitAll();
                })
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .exceptionHandling(exception -> exception
                        .authenticationEntryPoint(unAuthenticationCustomHandler)
                        .accessDeniedHandler(unAuthorizationCustomHandler));

        return httpSecurity.build();
    }

    private void sharedSecurityConfiguration(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .sessionManagement(httpSecuritySessionManagementConfigurer -> {
                    httpSecuritySessionManagementConfigurer
                            .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
                });
    }


    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedHeader("*");
        configuration.addAllowedOrigin("*");
        configuration.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
