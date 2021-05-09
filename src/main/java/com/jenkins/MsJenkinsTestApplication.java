package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
 
@SpringBootApplication
class MsJenkinsTestApplicationTests extends SpringBootServletInitializer{
 
    public static void main(String[] args) {
        SpringApplication.run(MsJenkinsTestApplicationTests.class, args);
    }
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MsJenkinsTestApplicationTests.class);
    }

}
