package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PieTest {

    Pie pie1 = new Pie(30, 15, 6);
    Pie pie2 = new Pie(25, 15, 4);

    @Test
    void getPrice() {
        String error = "������: ������������ �������� ��������� ������!";
        assertEquals(30, pie1.getPrice(), error);
        assertEquals(25, pie2.getPrice(), error);
    }

    @Test
    void getInfo() {
        String error = "������: ������������ �������� ���������� � ������!";
        assertEquals("����� 1: ��������� - 30, ������������� - 15.", pie1.getInfo(), error);
        assertEquals("����� 2: ��������� - 25, ������������� - 15.", pie2.getInfo(), error);
    }
}