package com.rllerena;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class FinanzasPersonales {
    public static final Logger LOGGER = LoggerFactory.getLogger(FinanzasPersonales.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.setBannerMode(Banner.Mode.OFF);
        application.run(FinanzasPersonales.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {
            LOGGER.info("Observaremos los beans proveidos por  Spring Boot");
            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                LOGGER.info("beanName {}", beanName);
            }
        };
    }
}
