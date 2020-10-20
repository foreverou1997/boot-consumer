package com.study.demo.bootconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author oulei
 */
@SpringBootApplication
@EnableFeignClients
public class BootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootConsumerApplication.class, args);
    }

}
