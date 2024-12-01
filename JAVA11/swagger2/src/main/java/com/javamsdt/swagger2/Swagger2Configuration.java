package com.javamsdt.swagger2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
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

    // Base package for scanning controllers
    @Value("${swagger2.base-package}")
    private String basePackage;

    @Value("${swagger2.api.terms-of-service-url:}")
    private String termsOfServiceUrl;

    @Value("${swagger2.api.contact-name:}")
    private String contactName;

    @Value("${swagger2.api.contact-email:}")
    private String contactEmail;

    @Value("${swagger2.api.contact-url:}")
    private String contactUrl;

    @Value("${swagger2.api.license:}")
    private String license;

    @Value("${swagger2.api.license-url:}")
    private String licenseUrl;


    // Paths to include and exclude
    @Value("${swagger2.include-paths:/api/**}")
    private String includePaths;

    @Value("${swagger2.exclude-paths:}")
    private String excludePaths;

    // UI Configuration
    @Value("${swagger2.ui.default-model-rendering:example}")
    private String defaultModelRendering;

    @Value("${swagger2.ui.deep-linking:true}")
    private boolean deepLinking;

    @Value("${swagger2.ui.display-operation-id:false}")
    private boolean displayOperationId;

    @Value("${swagger2.ui.default-model-expand-depth:1}")
    private int defaultModelExpandDepth;

    @Value("${swagger2.ui.default-operations-expand-depth:1}")
    private int defaultOperationsExpandDepth;

    @Value("${swagger2.ui.display-request-duration:false}")
    private boolean displayRequestDuration;

    @Value("${swagger2.ui.doc-expansion:list}")
    private String docExpansion;

    @Value("${swagger2.ui.filter:false}")
    private boolean filter;

    @Value("${swagger2.ui.max-url-length:2000}")
    private int maxUrlLength;

    @Value("${swagger2.ui.show-extensions:false}")
    private boolean showExtensions;

    @Value("${swagger2.ui.validator-url:}")
    private String validatorUrl;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(apiTitle)
                .description(apiDescription)
                .version(apiVersion)
                .termsOfServiceUrl(termsOfServiceUrl)
                .contact(contact())
                .license(license)
                .licenseUrl(licenseUrl)
                .build();
    }

    private Contact contact() {
        return new Contact(contactName, contactUrl, contactEmail);
    }
}
