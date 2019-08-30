package com.wenhao.zipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.filter.CharacterEncodingFilter;
import zipkin2.server.internal.EnableZipkinServer;


@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinApplication {

    @Autowired
    CharacterEncodingFilter characterEncodingFilter;

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
