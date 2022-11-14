package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    Coffee coffee1 = new Coffee(22, 5, 11, 7);
    Coffee coffee2 = new Coffee(15, 3, 7, 10);

    @Test
    void getPrice() {
        String error = "������: ������������ �������� ��������� ����!";
        assertEquals(22, coffee1.getPrice(), error);
        assertEquals(15, coffee2.getPrice(), error);
    }

    @Test
    void getInfo() {
        String error = "������: ������������ �������� ���������� � ����!";
        assertEquals("���� 1: ��������� - 22, ������������� ���� - 5.", coffee1.getInfo(), error);
        assertEquals("���� 2: ��������� - 15, ������������� ���� - 3.", coffee2.getInfo(), error);
    }
}