package com.epam.spring.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AppConfig1.class,
        AppConfig2.class,
        AppConfig3.class
})
public class MainConfig {
}