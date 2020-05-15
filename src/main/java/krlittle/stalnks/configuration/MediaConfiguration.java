package krlittle.stalnks.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(name = "media", value = "media.properties")
@ConfigurationProperties
public class MediaConfiguration {

    @Value("#{${media.image}}")
    private String image;

    @Bean
    public String image() {
        return image;
    }

}