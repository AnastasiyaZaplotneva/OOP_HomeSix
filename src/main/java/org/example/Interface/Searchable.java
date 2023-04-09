package org.example.Interface;

import org.example.Category;
import org.example.Product;
import org.example.Supplier;

import java.util.List;

public interface Searchable {
    List<Product> findProductByName(String productName);
    List<Product> findProductBySupplier(Supplier supplier);
    List<Product> findProductByCategory(Category category);


}
