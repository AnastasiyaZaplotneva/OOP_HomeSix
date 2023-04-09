package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Interface.Packing;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Employee {
    protected String name;
    protected String password;

    public Employee(String name, String password) {
        this.name = name;
        this.password = password;
    }

    void createShipment(List<Product> shipmentList, Packing pack){
        pack.packTheProducts(shipmentList);
        System.out.println("Товары " + shipmentList.toString() + " отгружены");
        System.out.println("Отгрузку создал " + toString());

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
