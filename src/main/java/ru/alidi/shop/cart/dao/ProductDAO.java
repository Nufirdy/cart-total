package ru.alidi.shop.cart.dao;

import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.alidi.shop.cart.model.Product;

import java.util.concurrent.ExecutionException;

@Component
public class ProductDAO {

    private final LoadingCache<Integer, Product> guavaCache;

    @Autowired
    public ProductDAO(LoadingCache<Integer, Product> guavaCache) {
        this.guavaCache = guavaCache;
    }

    public Product getProductById(Integer id) throws ExecutionException {
        return guavaCache.get(id);
    }
}
