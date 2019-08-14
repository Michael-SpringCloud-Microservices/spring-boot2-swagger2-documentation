package com.michael.spring.boot.swagger.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.michael.spring.boot.swagger.domain"})
@EnableJpaRepositories(basePackages = {"com.michael.spring.boot.swagger.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
