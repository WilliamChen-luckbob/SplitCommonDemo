package com.wwstation.other_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author william
 * @description
 * @Date: 2022-01-28 14:09
 */
@SpringBootApplication(scanBasePackages = {"com.wwstation"})
public class OtherServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OtherServiceApplication.class, args);
    }
}
