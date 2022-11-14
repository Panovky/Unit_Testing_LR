package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DataProcessor<T extends Product> {
    private List<T> products;

    DataProcessor(List<T> products) {
        this.products = products;
    }

    public List<T> filter(int max, int min) throws FilterException {

        if (max < min || max < 0 || min < 0) {
            throw new FilterException();
        } else {
            return products.stream()
                    .filter(element -> max >= element.getPrice() && element.getPrice() >= min)
                    .sorted(Comparator.comparingInt(T::getPrice))
                    .limit(2)
                    .collect(Collectors.toList());
        }
    }

    public List<T> search(int price) throws SearchException {

        if (price < 0) {
            throw new SearchException();
        } else {
            return products.stream()
                    .filter(element -> element.getPrice() == price)
                    .collect(Collectors.toList());
        }
    }
}
