package org.comedy.app.controller.configuration;

import org.comedy.domain.configuration.DomainConfiguration;
import org.comedy.infra.configuration.InfraConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({InfraConfiguration.class, DomainConfiguration.class})
@ComponentScan(basePackages = "org.comedy.app")
@Configuration
public class AppConfiguration {
}
