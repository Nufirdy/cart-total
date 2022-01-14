package ru.alidi.shop.cart.client;

import ru.alidi.shop.cart.model.Product;

public interface ProductServiceClient {

    //методы обращения к внешнему микросервису
    Product getProductById(Integer id);
}
