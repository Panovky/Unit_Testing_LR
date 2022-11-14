package com.company;

public abstract class Product {
    protected int price; // стоимость продукта
    private int orders; // количество заказов продукта

    Product(int price, int orders) { // конструктор класса Product
        this.price = price;
        this.orders = orders;
    }

    abstract int getPrice(); // метод для получения стоимости продукта
    abstract String getInfo(); // метод для вывода информации о продукте
}

