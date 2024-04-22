package com.ncsgroup.profiling.configuration;

import com.ncsgroup.profiling.repository.BaseRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static com.ncsgroup.profiling.constanst.ProfilingConstants.CommonConstants.BASE_PACKAGE_REPO;

@Configuration
@EnableJpaRepositories(
        basePackages = BASE_PACKAGE_REPO,
        repositoryBaseClass = BaseRepository.class
)
public class JpaRepositoryConfiguration {
}
