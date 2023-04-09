package org.example.Data;

import lombok.Data;
import org.example.Supplier;

import java.util.ArrayList;
import java.util.List;
@Data

public class SuppliersDatabase {
    private List<Supplier> supplierList;

    public SuppliersDatabase() {
        this.supplierList = new ArrayList<>();
    }

}
