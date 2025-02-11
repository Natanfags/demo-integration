package com.example.demospringintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("/integration/integration.xml")
public class DemoSpringIntegrationApplication {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext ctx = new SpringApplication(DemoSpringIntegrationApplication.class).run(args);
        System.out.println("press enter to terminate!");
        System.in.read();
        ctx.close();
    }

}
