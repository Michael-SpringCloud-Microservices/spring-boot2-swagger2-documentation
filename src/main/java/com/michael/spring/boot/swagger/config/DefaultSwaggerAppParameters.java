package com.michael.spring.boot.swagger.config;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;

import java.util.Collections;
import java.util.List;

public class DefaultSwaggerAppParameters implements SwaggerAppParameters {

    /**
     * Create global parameter that adds Authorization swagger token to each end-point
     * http://springfox.github.io/springfox/docs/current
     * https://github.com/springfox/springfox/issues/845
     */
    @Override
    public List<Parameter> globalOperationParameters() {
        return Collections.singletonList(new ParameterBuilder()
                .name("Authorization")
                .description("Authorization token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .defaultValue("Bearer X")
                .required(true)
                .build());
    }
}
