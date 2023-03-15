package com.ncsgroup.profiling.configuration;

import com.ncsgroup.profiling.repository.BaseRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.ncsgroup.profiling",
        repositoryBaseClass = BaseRepository.class
)
public class JpaRepositoryConfiguration {
}
