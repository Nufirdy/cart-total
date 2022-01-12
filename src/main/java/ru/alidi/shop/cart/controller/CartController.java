package ru.alidi.shop.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.alidi.shop.cart.model.CalculatedCart;
import ru.alidi.shop.cart.model.Cart;
import ru.alidi.shop.cart.service.CalculationService;

@RestController
@RequestMapping("/")
public class CartController implements CartManager<Integer> {

    private final CalculationService calculationService;

    @Autowired
    public CartController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @Override
    public CalculatedCart getCartTotal(@RequestBody Cart cart,
                                       @RequestParam(value = "paymentType") String paymentType,
                                       @RequestParam(value = "addressId", required = false) Integer addressId) {
        return calculationService.calculateCartTotal(cart, paymentType, addressId);
    }
}
