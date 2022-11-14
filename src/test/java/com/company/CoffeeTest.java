package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    Coffee coffee1 = new Coffee(22, 5, 11, 7);
    Coffee coffee2 = new Coffee(15, 3, 7, 10);

    @Test
    void getPrice() {
        String error = "Ошибка: возвращается неверная стоимость кофе!";
        assertEquals(22, coffee1.getPrice(), error);
        assertEquals(15, coffee2.getPrice(), error);
    }

    @Test
    void getInfo() {
        String error = "Ошибка: возвращается неверная информация о кофе!";
        assertEquals("Кофе 1: стоимость - 22, себестоимость воды - 5.", coffee1.getInfo(), error);
        assertEquals("Кофе 2: стоимость - 15, себестоимость воды - 3.", coffee2.getInfo(), error);
    }
}