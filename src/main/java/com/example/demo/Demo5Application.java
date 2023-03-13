package com.example.demo;

import com.example.demo.inDiffFile.MyConfigPropsInCustomPropertiesFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo5Application implements CommandLineRunner {

    @Value("${myconfig.other-prop}")
    String other;

    private final MyConfigPropsInCustomPropertiesFile myConfigPropsInCustomPropertiesFile;

    public Demo5Application(MyConfigPropsInCustomPropertiesFile myConfigPropsInCustomPropertiesFile) {
        this.myConfigPropsInCustomPropertiesFile = myConfigPropsInCustomPropertiesFile;
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo5Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("== custom file for config properties:");
        System.out.println(myConfigPropsInCustomPropertiesFile.getProp());
        System.out.println(other);
    }
}
