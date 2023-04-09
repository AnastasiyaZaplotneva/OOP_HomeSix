package org.example;

import lombok.Getter;
import lombok.Setter;
import org.example.Data.SuppliersDatabase;

@Setter
@Getter
public class Director extends Employee{
    private SuppliersDatabase listOfSuppliers;

    public Director() {
        this.listOfSuppliers = new SuppliersDatabase();
    }

    public Director(String name, String password) {
        super(name, password);
        this.listOfSuppliers = new SuppliersDatabase();
    }
  void addNewSupplier(Supplier supplier) {
      this.listOfSuppliers.getSupplierList().add(supplier);
      System.out.println("У вас появился новый поставщик " + supplier.getSupplierName());
  }

    void deleteNewSupplier(Supplier supplier) {
        this.listOfSuppliers.getSupplierList().remove(supplier);
        System.out.println("Вы разорвали сотрудничество с поставщиком " + supplier.getSupplierName());
    }

}
