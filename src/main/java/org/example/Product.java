package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private String productName;
    private Integer productCount; // количество единиц товара на складе
    private Double productPrice;
    private String cellAddress; // ячейка хранения
    private Category productCategory; // категория "бьющееся/небьющееся"
    private String receiptDate; // дата поступления товара
    private Supplier goodsSupplier; // поставщик товара

    public Product(String productName, Integer productCount, Double productPrice, String cellAddress,
                   Category productCategory, String receiptDate, Supplier goodsSupplier) {
        this.productName = productName;
        this.productCount = productCount;
        this.productPrice = productPrice;
        this.cellAddress = cellAddress;
        this.productCategory = productCategory;
        this.receiptDate = receiptDate;
        this.goodsSupplier = goodsSupplier;
    }

}
