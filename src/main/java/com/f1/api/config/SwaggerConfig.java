package com.f1.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("Formula 1 API")
                        .description("REST API for Formula 1 historical data")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Saptarshi's Dev Garage")
                                .url("https://github.com/sap7deb")));
    }
}
