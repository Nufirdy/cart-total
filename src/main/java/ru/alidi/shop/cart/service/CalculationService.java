package ru.alidi.shop.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alidi.shop.cart.dao.ProductDAO;
import ru.alidi.shop.cart.model.CalculatedCart;
import ru.alidi.shop.cart.model.Cart;

@Service
public class CalculationService {
    private final ProductDAO productDAO;

    @Autowired
    public CalculationService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public CalculatedCart calculateCartTotal(Cart cart) {
        /*
        собрать данные по ценам продуктов
        сложить все цены
        преобразовать в CalculatedCart
         */
        return null;
    }
}
