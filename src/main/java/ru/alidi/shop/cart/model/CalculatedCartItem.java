package ru.alidi.shop.cart.model;

import lombok.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public class CalculatedCartItem extends CartItem {

    private float sum;
}
