package com.company;

public class Pie extends Product{
    static int number = 1; // переменная-счетчик
    private int numberPie; // номер пирога
    private int cost; // себестоимость пирога

    Pie(int price, int cost, int orders) { // конструктор класса
        super(price, orders); // вызов конструктора суперкласса
        this.cost = cost;
        this.numberPie = number++;
    }

    public int getPrice() { // метод для получения стоимости пирога
        return this.price;
    }

    public String getInfo() { // метод для вывода информации о пироге
        return String.format("Пирог %d: стоимость - %d, себестоимость - %d.",
                this.numberPie, this.price, this.cost);
    }
}
