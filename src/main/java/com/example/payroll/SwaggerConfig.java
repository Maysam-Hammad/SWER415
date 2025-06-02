package com.example.payroll;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info().title("My REST API")
                .description("Some custom description of API.")
                .version("1.0")
                .contact(new Contact().name("Rawan Gedeon").email("www.rawan.com").url("rawang@gmail.com"))
                .license(new License().name("License of API").url("API license URL")));
    }
}