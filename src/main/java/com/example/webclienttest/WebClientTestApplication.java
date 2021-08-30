package com.example.webclienttest;

import com.example.webclienttest.client.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebClientTestApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(WebClientTestApplication.class, args);

        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        System.out.println(">> message = " + greetingClient.getMessage().block());
//        SpringApplication.run(WebClientTestApplication.class, args);
    }

}
