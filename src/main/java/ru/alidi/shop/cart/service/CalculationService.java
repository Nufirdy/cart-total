package ru.alidi.shop.cart.service;

import ru.alidi.shop.cart.model.CalculatedCart;
import ru.alidi.shop.cart.model.Cart;

public interface CalculationService {

    CalculatedCart calculateCartTotal(Cart cart);
}
