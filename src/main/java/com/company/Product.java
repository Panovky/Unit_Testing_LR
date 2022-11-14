package com.company;

public abstract class Product {
    protected int price; // ��������� ��������
    private int orders; // ���������� ������� ��������

    Product(int price, int orders) { // ����������� ������ Product
        this.price = price;
        this.orders = orders;
    }

    abstract int getPrice(); // ����� ��� ��������� ��������� ��������
    abstract String getInfo(); // ����� ��� ������ ���������� � ��������
}

