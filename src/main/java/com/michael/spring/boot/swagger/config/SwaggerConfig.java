package com.michael.spring.boot.swagger.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableConfigurationProperties(CommonWebSwaggerProperties.class)

public class SwaggerConfig extends WebMvcConfigurationSupport {

	private static final Set<String> DEFAULT_PRODUCES = new HashSet<>(Arrays.asList("application/json"));
	private static final Set<String> DEFAULT_CONSUMES = new HashSet<>(Arrays.asList("application/json"));

	@Autowired
	private CommonWebSwaggerProperties commonWebSwaggerProperties;

	@Bean
	@ConditionalOnMissingBean(SwaggerAppParameters.class)
	public SwaggerAppParameters swaggerAppParameters() {
		return new DefaultSwaggerAppParameters();
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage(commonWebSwaggerProperties.getControllerPackage()))
		//.apis(Predicates.not(RequestHandlerSelectors.basePackage(commonWebSwaggerProperties.getFrameworkPackagesToExclude())))
		.paths(regex(commonWebSwaggerProperties.getEndpointsPath()))
		//.paths(PathSelectors.any())
		.build()
		.apiInfo(metaData())
		.consumes(DEFAULT_CONSUMES)
		.produces(DEFAULT_PRODUCES)
		.globalOperationParameters(swaggerAppParameters().globalOperationParameters());
	}
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
		.title(commonWebSwaggerProperties.getTitle())
		.description(commonWebSwaggerProperties.getDescription())
		.version(commonWebSwaggerProperties.getVersion())
		.license(commonWebSwaggerProperties.getLicense())
		.licenseUrl(commonWebSwaggerProperties.getLicenseUrl())
		.contact(new Contact(commonWebSwaggerProperties.getAuthorName(), commonWebSwaggerProperties.getAuthorWebsiteUrl(),commonWebSwaggerProperties.getAuthorEmailId()))
		.build();
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html")
		.addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**")
		.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
