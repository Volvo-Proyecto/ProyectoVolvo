package com.volvo.volvo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.Value;

@Configuration
public class WebClientConfig {
    @Value("${services.genero.url}")
    private String generoServiceUrl;

    @Value("${services.plataforma.url}")
    private String plataformaServiceUrl;

    @Value("${services.estudio.url}")
    private String estudioServiceUrl;

    @Bean
    public WebClient generowebClient() {
        return WebClient.builder().baseUrl(generoServiceUrl).build();
    }
    @Bean
    public WebClient plataformawebClient() {
        return WebClient.builder().baseUrl(plataformaServiceUrl).build();
    }
    @Bean
    public WebClient estudiowebClient() {
        return WebClient.builder().baseUrl(estudioServiceUrl).build();
    }

}
