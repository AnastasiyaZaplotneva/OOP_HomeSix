package org.example;

import org.example.Data.SuppliersDatabase;
import org.example.Data.Warehouse;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // блок инициализации первичных данных для тестирования

        Category category1 = new Category("fragile");
        Category category2 = new Category("not fragile");

        Supplier supplier1 = new Supplier("GoodCompany");
        Supplier supplier2 = new Supplier("Tech");
        Supplier supplier3 = new Supplier("SSR");
        Supplier supplier4 = new Supplier("HomeTech");

        Product product1 = new Product("table", 5, 3550.0, "b2",
                category2, "09.04.2023", supplier1);
        Product product2 = new Product("plate", 24, 149.0, "c10",
                category1, "07.04.2023", supplier3);
        Product product3 = new Product("notebook", 4, 37000.0, "a3",
                category1, "09.04.2023", supplier2);
        Product product4 = new Product("textile", 9, 236.0, "b4",
                category2, "08.04.2023", supplier1);
        Product product5 = new Product("pillow", 3, 500.0, "a6",
                category2, "09.04.2023", supplier1);

        Warehouse warehouse = new Warehouse();

        SuppliersDatabase suppliersDatabase = new SuppliersDatabase();

        Employee employee = new Employee("Ivan Ivanov", "123456");
        Director director = new Director("Petr Petrov", "qwerty");
        director.setListOfSuppliers(suppliersDatabase);


        // проверка методов и связей

        System.out.println("Заполняем склад товарами");

        warehouse.addProduct(product1);
        warehouse.addProduct(product2);
        warehouse.addProduct(product3);
        warehouse.addProduct(product4);
        warehouse.addProduct(product5);
        System.out.println(warehouse.getProductList());

        System.out.println();
        System.out.println("Выполняем поиск по названию товара");
        System.out.println(warehouse.findProductByName("plate"));

        System.out.println();
        System.out.println("Выполняем поиск по поставщику");
        System.out.println(warehouse.findProductBySupplier(supplier1));

        System.out.println();
        System.out.println("Выполняем поиск по категории");
        List<Product> fragileList = warehouse.findProductByCategory(category1);
        List<Product> notFragileList = warehouse.findProductByCategory(category2);
        System.out.println(fragileList.toString());
        System.out.println(notFragileList.toString());

        System.out.println();
        System.out.println("Создаем отгрузку от имени сотрудника");
        employee.createShipment(fragileList, new FragilePacking());

        System.out.println();
        System.out.println("Создаем отгрузку от имени директора");
        director.createShipment(notFragileList, new NotFragilePacking());

        System.out.println();
        System.out.println("Проверяем функционал склада: удаляем товар, меняем количество, проверяем количество " +
                           "товаров на остатке. Выводим обновленный список");
        warehouse.deleteProduct(product1);
        warehouse.checkBalance(product2);
        warehouse.changeProductCount(product4, 7);
        System.out.println(warehouse.getProductList());

        System.out.println();
        System.out.println("Добавляем поставщиков в базу от имени директора");
        director.addNewSupplier(supplier1);
        director.addNewSupplier(supplier2);
        director.addNewSupplier(supplier3);
        director.addNewSupplier(supplier4);

        System.out.println(director.getListOfSuppliers());

        System.out.println();
        System.out.println("Удаляем поставщика из базы от имени директора");
        director.deleteNewSupplier(supplier4);

        System.out.println(director.getListOfSuppliers());

    }
}