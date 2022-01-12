package ru.alidi.shop.cart.controller;

import ru.alidi.shop.cart.model.CalculatedCart;
import ru.alidi.shop.cart.model.Cart;
import ru.alidi.shop.cart.model.CartItem;

import java.util.List;

public interface CartManager<ID> {

    CalculatedCart getCartTotal(Cart cart,
                                String paymentType,
                                ID addressId);
}
