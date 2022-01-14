package ru.alidi.shop.cart.model;

import lombok.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class CartItem {

    private Integer id;

    private Integer quantity;
}
