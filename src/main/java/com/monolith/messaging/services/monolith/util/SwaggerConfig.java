package com.monolith.messaging.services.monolith.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${swagger.host.url}")
    private String hostUrl;

    @Bean
    public Object api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .host(hostUrl)
                .groupName("group name")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails() {
        return new ApiInfo("Monolith Service API", "API for Messaging App", "0.1", "All Rights Reserved",
                new springfox.documentation.service.Contact("Messaging Service",
                        "https://github.com/tylercodes1/messaging-monolith-api", "tylerkim@outlook.com"),
                "Tyler Kim", "", Collections.emptyList());
    }
}
