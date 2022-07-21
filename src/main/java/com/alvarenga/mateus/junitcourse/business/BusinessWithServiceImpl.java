package com.alvarenga.mateus.junitcourse.business;

import java.util.Arrays;

public class BusinessWithServiceImpl {
    private SomeDataService dataService;

    public BusinessWithServiceImpl(SomeDataService dataService) {
        this.dataService = dataService;
    }

    public int calculateSum() {
        int[] numbers = dataService.getNumbers();
        return  Arrays.stream(numbers).sum();
    }
}
