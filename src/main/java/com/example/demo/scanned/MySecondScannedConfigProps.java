package com.example.demo.scanned;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 2/27/2023.</p>
 * <p>Project: demo5</p>
 * *
 */
@ConfigurationProperties("my.second.scanned.props")
public class MySecondScannedConfigProps {

    String prop1;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
