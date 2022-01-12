package ru.alidi.shop.cart.controller;

import ru.alidi.shop.cart.model.CalculatedCart;
import ru.alidi.shop.cart.model.Cart;

public interface CartManager {

    CalculatedCart getCartTotal(Cart cart);
}
