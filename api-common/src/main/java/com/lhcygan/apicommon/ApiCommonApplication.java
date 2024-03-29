package com.lhcygan.apicommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApiCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCommonApplication.class, args);
    }

}
