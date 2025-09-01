package com.example.TotorialApp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Tutorial App API")
                        .version("1.0")
                        .description("API documentation for Tutorial App")
                        .contact(new Contact().name("Ahmed AbdEl-Rasoul").email("ahmedabdelrasoul7@email.com"))
                );
    }
}