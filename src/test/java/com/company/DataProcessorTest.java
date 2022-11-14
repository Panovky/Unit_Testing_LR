package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class DataProcessorTest {

    private List<Coffee> coffee = new ArrayList<>();
    private List<Pie> pie = new ArrayList<>();
    private DataProcessor p1, p2;
    private List<Product> expectedList;

    {
        coffee.add(new Coffee(22, 5, 11, 7));
        coffee.add(new Coffee(20, 2, 10, 5));
        coffee.add(new Coffee(25, 4, 10, 2));
        coffee.add(new Coffee(15, 7, 5, 10));
        coffee.add(new Coffee(10, 5, 0, 5));
        coffee.add(new Coffee(10, 3, 2, 6));

        pie.add(new Pie(30, 15, 6));
        pie.add(new Pie(25, 15, 4));
        pie.add(new Pie(25, 20, 11));
        pie.add(new Pie(45, 40, 10));
        pie.add(new Pie(40, 30, 6));

        p1 = new DataProcessor<>(coffee);
        p2 = new DataProcessor<>(pie);
    }

    @Test
    void filter() throws FilterException {
        String error = "Ошибка при сортировке!";

        expectedList = List.of(coffee.get(4), coffee.get(5));
        assertEquals(expectedList, p1.filter(15, 10), error);

        expectedList = List.of(coffee.get(1), coffee.get(0));
        assertEquals(expectedList, p1.filter(30, 20), error);

        expectedList = List.of();
        assertEquals(expectedList, p1.filter(9, 1), error);

        expectedList = List.of();
        assertEquals(expectedList, p1.filter(50, 40), error);

        expectedList = List.of(coffee.get(2));
        assertEquals(expectedList, p1.filter(30, 25), error);

        expectedList = List.of(coffee.get(3));
        assertEquals(expectedList, p1.filter(17, 13), error);

        expectedList = List.of(pie.get(4), pie.get(3));
        assertEquals(expectedList, p2.filter(45, 40), error);

        expectedList = List.of(pie.get(1), pie.get(2));
        assertEquals(expectedList, p2.filter(30, 25), error);

        expectedList = List.of();
        assertEquals(expectedList, p2.filter(10, 1), error);

        expectedList = List.of();
        assertEquals(expectedList, p2.filter(60, 50), error);

        expectedList = List.of(pie.get(3));
        assertEquals(expectedList, p2.filter(47, 43), error);

        expectedList = List.of(pie.get(4));
        assertEquals(expectedList, p2.filter(40, 35), error);
    }

    @Test
    void search() throws SearchException {
        String error = "Ошибка при поиске!";

        expectedList = List.of(coffee.get(4), coffee.get(5));
        assertEquals(expectedList, p1.search(10), error);

        expectedList = List.of(coffee.get(0));
        assertEquals(expectedList, p1.search(22), error);

        expectedList = List.of();
        assertEquals(expectedList, p1.search(50), error);

        expectedList = List.of(pie.get(1), pie.get(2));
        assertEquals(expectedList, p2.search(25), error);

        expectedList = List.of(pie.get(3));
        assertEquals(expectedList, p2.search(45), error);

        expectedList = List.of();
        assertEquals(expectedList, p2.search(10), error);
    }

    @Test
    void filterException() {
        String error = "Не происходит выброс исключения в методе filter!";

        assertThrows(FilterException.class, () -> p1.filter(-20, -10), error);

        assertThrows(FilterException.class, () -> p1.filter(10, 30), error);

        assertThrows(FilterException.class, () -> p1.filter(0, -10), error);

        assertThrows(FilterException.class, () -> p2.filter(-10, -5), error);

        assertThrows(FilterException.class, () -> p2.filter(5, 20), error);

        assertThrows(FilterException.class, () -> p2.filter(0, -3), error);
    }

    @Test
    void searchException() {
        String error = "Не происходит выброс исключения в методе search!";

        assertThrows(SearchException.class, () -> p1.search(-10), error);

        assertThrows(SearchException.class, () -> p1.search(-35), error);

        assertThrows(SearchException.class, () -> p2.search(-20), error);

        assertThrows(SearchException.class, () -> p2.search(-7), error);
    }
}