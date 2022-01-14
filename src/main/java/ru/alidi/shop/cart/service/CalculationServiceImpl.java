package ru.alidi.shop.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alidi.shop.cart.dao.ProductDAO;
import ru.alidi.shop.cart.model.CalculatedCart;
import ru.alidi.shop.cart.model.CalculatedCartItem;
import ru.alidi.shop.cart.model.Cart;
import ru.alidi.shop.cart.model.Product;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

import static java.util.stream.Collectors.*;

@Service
public class CalculationServiceImpl implements CalculationService {
    private final ProductDAO productDAO;
    private final MathContext priceCalculationContext;

    @Autowired
    public CalculationServiceImpl(ProductDAO productDAO, MathContext priceCalculationContext) {
        this.productDAO = productDAO;
        this.priceCalculationContext = priceCalculationContext;
    }

    @Override
    public CalculatedCart calculateCartTotal(Cart cart) {
        List<CalculatedCartItem> calculatedItems = cart.getProducts().stream()
                .map(cartItem -> {
                    Product product = productDAO.getProductById(cartItem.getId());
                    return new CalculatedCartItem(cartItem.getId(),
                            cartItem.getQuantity(),
                            calculateItemSubtotal(product.getPrice(), cartItem.getQuantity()));
                })
                .collect(toList());

        return new CalculatedCart(calculatedItems, calculateTotal(calculatedItems));
    }

    private BigDecimal calculateItemSubtotal(BigDecimal price, int quantity) {
        return price.multiply(BigDecimal.valueOf(quantity), priceCalculationContext);
    }

    private BigDecimal calculateTotal(List<CalculatedCartItem> calculatedItems) {
        return calculatedItems.stream()
                .map(CalculatedCartItem::getSubtotal)
                .reduce(BigDecimal.ZERO, (item1, item2) -> item1.add(item2, priceCalculationContext));
    }
}
