package com.javamsdt.swagger.configuration;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.stereotype.Component;

@Component
public class SwaggerProperties {
    private String title = "API Documentation";
    private String description = "API Description";
    private String version = "1.0.0";
    private String termsOfService;
    private Contact contact = new Contact();
    private License license = new License();

    public SwaggerProperties() {
    }

    public SwaggerProperties(String title, String description, String version, String termsOfService, Contact contact, License license) {
        this.title = title;
        this.description = description;
        this.version = version;
        this.termsOfService = termsOfService;
        this.contact = contact;
        this.license = license;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTermsOfService() {
        return termsOfService;
    }

    public void setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}

