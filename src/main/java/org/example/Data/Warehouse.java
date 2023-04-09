package org.example.Data;

import lombok.Data;
import org.example.Category;
import org.example.Interface.Searchable;
import org.example.Interface.WarehouseOperation;
import org.example.Product;
import org.example.Supplier;

import java.util.ArrayList;
import java.util.List;
@Data

public class Warehouse implements Searchable, WarehouseOperation {
    private List<Product> productList;

    public Warehouse() {
        this.productList = new ArrayList<>();
    }

    @Override
    public List<Product> findProductByName(String productName) {
        List<Product> searchResult = new ArrayList<>();
        for (Product p: productList) {
            if(p.getProductName().equals(productName)) {
                searchResult.add(p);
            }
        }
        return searchResult;
    }

    @Override
    public List<Product> findProductBySupplier(Supplier supplier) {
        List<Product> searchResult = new ArrayList<>();
        for (Product p: productList) {
            if(p.getGoodsSupplier().getSupplierName().equals(supplier.getSupplierName())) {
                searchResult.add(p);
            }
        }
        return searchResult;
    }

    @Override
    public List<Product> findProductByCategory(Category category) {
        List<Product> searchResult = new ArrayList<>();
        for (Product p: productList) {
            if(p.getProductCategory().getStatus().equals(category.getStatus())) {
                searchResult.add(p);
            }
        }
        return searchResult;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public void changeProductCount(Product product, Integer count) {
        product.setProductCount(count);
    }

    @Override
    public Integer checkBalance(Product product) {
        return product.getProductCount();
    }
}
