package org.oplearn.project.configuration;

import org.oplearn.project.repository.BaseRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.oplearn.project.constanst.OpLearnConstants.CommonConstants.BASE_PACKAGE_REPO;

@Configuration
@EnableJpaRepositories(
        basePackages = BASE_PACKAGE_REPO,
        repositoryBaseClass = BaseRepository.class
)
public class JpaRepositoryConfiguration {
}
