package ru.alidi.shop.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.MathContext;
import java.math.RoundingMode;

@SpringBootApplication
public class CartTotalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartTotalApplication.class, args);
    }

    @Bean
    public MathContext getPriceCalculationContext() {
        return new MathContext(2, RoundingMode.HALF_EVEN);
    }
}
