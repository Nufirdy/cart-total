package ru.alidi.shop.cart.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Cart {

    private List<CartItem> products;

    private String paymentType;

    private Integer addressId;
}
