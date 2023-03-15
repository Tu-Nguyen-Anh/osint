package com.ncsgroup.profiling.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

import static com.ncsgroup.profiling.constanst.ProfilingConstants.AuthConstant.AUTHORIZATION;
import static com.ncsgroup.profiling.constanst.ProfilingConstants.AuthConstant.TYPE_TOKEN;

@Component
@Slf4j
public class JwtAuthenticationFilter extends OncePerRequestFilter {
  @Override
  protected void doFilterInternal(
        HttpServletRequest request,
        HttpServletResponse response,
        FilterChain filterChain
  ) throws ServletException, IOException {
    log.debug(
          "(doFilterInternal)request: {}, response: {}, filterChain: {}",
          request,
          response,
          filterChain
    );

    String accessToken = request.getHeader(AUTHORIZATION);

    if (Objects.isNull(accessToken)) {
      filterChain.doFilter(request, response);
      return;
    } else if (!accessToken.startsWith(TYPE_TOKEN)) {
      filterChain.doFilter(request, response);
      return;
    }

    filterChain.doFilter(request, response);
  }
}
