package ru.rtc.medline.file.storage.infrastructure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    private static final String API_TITLE = "test-service";

    @Value("${info.application.version}")
    private String artifactVersion;

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_TITLE)
                        .version(artifactVersion));
    }

}
