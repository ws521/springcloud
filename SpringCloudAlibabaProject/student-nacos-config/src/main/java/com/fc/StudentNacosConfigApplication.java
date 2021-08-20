package com.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class StudentNacosConfigApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(StudentNacosConfigApplication.class, args);
        while (true) {
            String property = run.getEnvironment().getProperty("user.name");
            System.out.println(property);
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
