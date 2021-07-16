package com.epam.spring.core.config;

import com.epam.spring.core.beans2.CatAnimal;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CatAnimal.class})
public class AppConfig2 {
}
