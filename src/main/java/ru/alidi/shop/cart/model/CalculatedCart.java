package ru.alidi.shop.cart.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class CalculatedCart {

    @NotEmpty
    private List<CalculatedCartItem> products;

    private BigDecimal total;
    //возможная доп информация о посчитанной корзине
}
