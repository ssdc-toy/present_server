package com.wednesday.present_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PresentApplication {

    public static void main(String[] args) {

        Hello_Model hello = new Hello_Model();
        hello.setData("halo");
        String data = hello.getData();
        System.out.println("data = " + data);

        SpringApplication.run(PresentApplication.class, args);
    };
}
