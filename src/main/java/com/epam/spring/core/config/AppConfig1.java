package com.epam.spring.core.config;

import com.epam.spring.core.beans1.BeanA;
import com.epam.spring.core.beans1.BeanB;
import com.epam.spring.core.beans1.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

    @Bean
    public BeanA beanA(){
        return new BeanA();
    }

    @Bean
    public BeanB beanB(){
        return new BeanB();
    }

    @Bean
    public BeanC beanC(){
        return new BeanC();
    }
}
