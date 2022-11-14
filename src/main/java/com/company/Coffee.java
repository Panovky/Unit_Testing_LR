package com.company;

public class Coffee extends Product {
    static int number = 1; // ����������-�������
    private int numberCoffee; // ����� ����
    private int waterCost; // ������������� ����
    private int grainCost; // ������������� ����

    Coffee(int price, int waterCost, int grainCost, int orders) { // ����������� ������
        super(price, orders); // ����� ������������ �����������
        this.waterCost = waterCost;
        this.grainCost = grainCost;
        this.numberCoffee = number++;
    }

    public int getPrice() { // ����� ��� ��������� ��������� ����
        return this.price;
    }

    public String getInfo() { // ����� ��� ������ ���������� � ����
        return String.format("���� %d: ��������� - %d, ������������� ���� - %d.",
                this.numberCoffee, this.price, this.waterCost);
    }
}
