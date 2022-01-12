package ru.alidi.shop.cart.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public class CalculatedCartItem extends CartItem {

    private BigDecimal subtotal;
}
