package ru.alidi.shop.cart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.alidi.shop.cart.client.ProductServiceClient;
import ru.alidi.shop.cart.model.Product;

/**
 * Класс для получения данных о продукте. Использует кэш.
 */
@Component
public class ProductDAO {

    private final ProductServiceClient productServiceClient;

    @Autowired
    public ProductDAO(ProductServiceClient productServiceClient) {
        this.productServiceClient = productServiceClient;
    }

    public Product getProductById(Integer id) {
        return null;
    }
}
