package ru.alidi.shop.cart.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public class CalculatedCartItem extends CartItem {

    private BigDecimal subtotal;

    public CalculatedCartItem(Integer id, Integer quantity, BigDecimal subtotal) {
        super(id, quantity);
        this.subtotal = subtotal;
    }
}
