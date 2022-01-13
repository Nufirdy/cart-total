package ru.alidi.shop.cart.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Cart {

    @NotEmpty
    private List<CartItem> products;

    @NotNull
    private String paymentType;

    private Integer addressId;
}
