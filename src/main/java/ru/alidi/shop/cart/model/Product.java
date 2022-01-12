package ru.alidi.shop.cart.model;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Product {

    private Integer id;

    private BigDecimal price;
}
