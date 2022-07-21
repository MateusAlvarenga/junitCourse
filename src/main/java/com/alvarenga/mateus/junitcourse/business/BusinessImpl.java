package com.alvarenga.mateus.junitcourse.business;

import java.util.Arrays;

public class BusinessImpl {
    public int calculateSum(int[] numbers) {
        return  Arrays.stream(numbers).sum();
    }
}
