package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PieTest {

    Pie pie1 = new Pie(30, 15, 6);
    Pie pie2 = new Pie(25, 15, 4);

    @Test
    void getPrice() {
        String error = "Ошибка: возвращается неверная стоимость пирога!";
        assertEquals(30, pie1.getPrice(), error);
        assertEquals(25, pie2.getPrice(), error);
    }

    @Test
    void getInfo() {
        String error = "Ошибка: возвращается неверная информация о пироге!";
        assertEquals("Пирог 1: стоимость - 30, себестоимость - 15.", pie1.getInfo(), error);
        assertEquals("Пирог 2: стоимость - 25, себестоимость - 15.", pie2.getInfo(), error);
    }
}