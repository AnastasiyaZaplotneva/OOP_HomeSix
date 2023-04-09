package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Interface.Suppliers;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier implements Suppliers {
    private String supplierName;

    @Override
    public String getSupplierName() {
        return supplierName;
    }
}
