package com.javamsdt.swagger2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    @Value("${swagger2.api.title:Default API Title}")
    private String apiTitle;

    @Value("${swagger2.api.description:Default API Description}")
    private String apiDescription;

    @Value("${swagger2.api.version:1.0}")
    private String apiVersion;

    @Value("${swagger2.base-package}")
    private String basePackage;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder()
                        .title(apiTitle)
                        .description(apiDescription)
                        .version(apiVersion)
                        .build());
    }
}
