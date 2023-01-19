package org.comedy.infra.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("org.comedy.infra.entity")
@EnableJpaRepositories("org.comedy.infra.repository")
@Configuration
public class DatabaseConfiguration {
}
