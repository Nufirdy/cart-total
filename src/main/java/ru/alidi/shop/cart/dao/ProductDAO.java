package ru.alidi.shop.cart.dao;

import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.alidi.shop.cart.model.Product;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Component
public class ProductDAO {

    private final LoadingCache<Integer, Product> guavaCache;

    @Autowired
    public ProductDAO(LoadingCache<Integer, Product> guavaCache) {
        this.guavaCache = guavaCache;
    }

    public Optional<Product> getProductById(Integer id) {
        try {
            return Optional.of(guavaCache.get(id));
        } catch (Exception e) {//обработка Exception для охвата как проверяемых так и непроверяемых исключений
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
