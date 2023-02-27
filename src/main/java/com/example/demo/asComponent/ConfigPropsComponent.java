package com.example.demo.asComponent;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 2/27/2023.</p>
 * <p>Project: demo5</p>
 * *
 */
@Component
@ConfigurationProperties(prefix = "my.component.props")
public class ConfigPropsComponent {

    String prop1;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
