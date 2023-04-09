package org.example.Interface;

import org.example.Product;

public interface WarehouseOperation {
    void addProduct(Product product);
    void deleteProduct(Product product);
    void changeProductCount(Product product, Integer count);
    Integer checkBalance(Product product);
}
