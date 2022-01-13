package ru.alidi.shop.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alidi.shop.cart.model.CalculatedCart;
import ru.alidi.shop.cart.model.Cart;
import ru.alidi.shop.cart.service.CalculationService;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class CartController implements CartManager {

    private final CalculationService calculationService;

    @Autowired
    public CartController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @Override
    @PostMapping("total")
    public CalculatedCart getCartTotal(@RequestBody @Valid Cart cart) {
        return calculationService.calculateCartTotal(cart);
    }
}
