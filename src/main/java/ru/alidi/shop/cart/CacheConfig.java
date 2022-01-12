package ru.alidi.shop.cart;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alidi.shop.cart.client.ProductServiceClient;
import ru.alidi.shop.cart.model.Product;

@Configuration
public class CacheConfig {
    private final ProductServiceClient productServiceClient;

    @Autowired
    public CacheConfig(ProductServiceClient productServiceClient) {
        this.productServiceClient = productServiceClient;
    }

    @Bean
    public LoadingCache<Integer, Product> getGuavaProductCache() {
        return CacheBuilder.newBuilder()
                .build(new CacheLoader<Integer, Product>() {
                    @Override
                    public Product load(Integer key) throws Exception {
                        return productServiceClient.getProductById(key);
                    }
                })
    }
}
