package ru.alidi.shop.cart.dao;

import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.alidi.shop.cart.model.Product;

import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;

@Component
public class ProductDAO {

    private final LoadingCache<Integer, Product> guavaCache;

    @Autowired
    public ProductDAO(LoadingCache<Integer, Product> guavaCache) {
        this.guavaCache = guavaCache;
    }

    public Product getProductById(Integer id) {
        Product product = null;
        try {
            product = guavaCache.get(id);
        } catch (ExecutionException e) {
            //предпочитаемый в системе способ обработки ошибок
        }
        return product;
    }
}
