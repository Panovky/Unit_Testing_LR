package com.company;

public class Pie extends Product{
    static int number = 1; // ����������-�������
    private int numberPie; // ����� ������
    private int cost; // ������������� ������

    Pie(int price, int cost, int orders) { // ����������� ������
        super(price, orders); // ����� ������������ �����������
        this.cost = cost;
        this.numberPie = number++;
    }

    public int getPrice() { // ����� ��� ��������� ��������� ������
        return this.price;
    }

    public String getInfo() { // ����� ��� ������ ���������� � ������
        return String.format("����� %d: ��������� - %d, ������������� - %d.",
                this.numberPie, this.price, this.cost);
    }
}
