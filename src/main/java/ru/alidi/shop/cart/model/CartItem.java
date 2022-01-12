package ru.alidi.shop.cart.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode()
@ToString
public class CartItem {

    private int id;

    private int quantity;
}
