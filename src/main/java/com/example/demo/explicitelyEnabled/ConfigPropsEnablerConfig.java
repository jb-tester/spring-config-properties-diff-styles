package com.example.demo.explicitelyEnabled;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 2/27/2023.</p>
 * <p>Project: demo5</p>
 * *
 */
@Configuration
@EnableConfigurationProperties({MyFirstEnabledConfigProps.class,MySecondEnabledConfigProps.class})
public class ConfigPropsEnablerConfig {
}
