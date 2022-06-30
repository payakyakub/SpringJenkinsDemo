package com.java.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

    static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application Started..!!!");
    }

    public static void main(String[] args) {

        logger.info("Application Executed..!!!");
        SpringApplication.run(SpringJenkinsDemoApplication.class, args);
    }

}
