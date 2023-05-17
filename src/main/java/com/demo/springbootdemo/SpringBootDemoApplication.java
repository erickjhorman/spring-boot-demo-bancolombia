package com.demo.springbootdemo;

import com.demo.springbootdemo.model.CreditCard;
import com.demo.springbootdemo.service.CreditCardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CreditCardRepository repository) {
        return (args) -> {
			repository.save(new CreditCard(1, "Master card" , new BigDecimal("10")));
			repository.save(new CreditCard(2, "Visa" ,new BigDecimal("10")));
        };
    }

}
