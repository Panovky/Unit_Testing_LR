package com.company;

public class SearchException extends Exception {

    SearchException() {
        super("Ошибка: указан некорректный параметр для поиска!");
    }
}

