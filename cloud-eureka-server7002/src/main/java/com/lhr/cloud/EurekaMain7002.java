package com.lhr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: TODO
 * @author LHR
 * @date 2022/6/28 9:31
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002
{
    public static void main(String[] args) {
            SpringApplication.run(EurekaMain7002.class, args);
    }
}
