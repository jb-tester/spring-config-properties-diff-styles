package com.example.demo.inDiffFile;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 3/13/2023.</p>
 * <p>Project: spring-config-properties-diff-styles</p>
 * *
 */
@Component
@ConfigurationProperties(prefix = "myconfig")
@PropertySource(value = "classpath:/myconfig.properties")
public class MyConfigPropsInCustomPropertiesFile {
    String prop;
    String otherProp;

    public String getOtherProp() {
        return otherProp;
    }

    public void setOtherProp(String otherProp) {
        this.otherProp = otherProp;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}
