package com.example.demo.asBeanMethod;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPropBeanConfig {

    @Bean
    @ConfigurationProperties("my.bean.public")
    public BeanConfProperties1 beanConfProperties1() {
        return new BeanConfProperties1();
    }
    @Bean
    @ConfigurationProperties("my.bean.nonpublic")
    BeanConfProperties2 beanConfProperties2() {
        return new BeanConfProperties2();
    }
}
