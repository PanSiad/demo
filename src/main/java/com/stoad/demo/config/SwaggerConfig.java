package com.stoad.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(
                        new ApiInfo("Chore API", "Api Documentation", "1.0", "",
                                new Contact("", "", "stoad@dev.com"), "Apache 2.0",
                                "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>()))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stoad.demo.controller"))
                .build();
    }
}