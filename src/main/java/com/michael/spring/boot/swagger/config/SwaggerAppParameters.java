package com.michael.spring.boot.swagger.config;

import springfox.documentation.service.Parameter;

import java.util.List;

public interface SwaggerAppParameters {

    List<Parameter> globalOperationParameters();
}
