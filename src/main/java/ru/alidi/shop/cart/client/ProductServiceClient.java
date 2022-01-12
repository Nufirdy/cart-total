package ru.alidi.shop.cart.client;

import ru.alidi.shop.cart.model.Product;

//забыл в какой библиотеке аннотация для автоматического создания клиента из интерфейса
public interface ProductServiceClient {

    //методы обращения к внешнему микросервису
    Product getProductById(Integer id);
}
