package me.dio.academia.digital.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RESTful API with Java 17 and Spring Boot 3")
                        .version("v1")
                        .description("Projeto de um sistema simples de academia para cadastro de aluno" +
                                " e registro de avaliações")
                        .termsOfService("url")
                        .license(
                                new License()
                                        .name("Apache 2.0")
                                        .url("url")
                        )
                        .contact(new Contact()
                                .url("http://github.com/leandromelolm")
                                .name("Github - Leandro Melo"))
                );
    }
}
// http://localhost:8080/swagger-ui/index.html
// http://localhost:8080/v3/api-docs