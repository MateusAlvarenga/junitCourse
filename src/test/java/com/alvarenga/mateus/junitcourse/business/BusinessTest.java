package com.alvarenga.mateus.junitcourse.business;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BusinessTest {

    @Test
    public void testCalculateSum() {
        // given
        BusinessImpl business = new BusinessImpl();
        int[] numbers = {5,5,5};
        //when
        int result = business.calculateSum(numbers);
        //then
        assertEquals(15, result);
    }

    @Test
    public void testCalculateSumEmpty() {
        // given
        BusinessImpl business = new BusinessImpl();
        int[] numbers = {};
        //when
        int result = business.calculateSum(numbers);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testCalculateSumOneValue() {
        // given
        BusinessImpl business = new BusinessImpl();
        int[] numbers = {10};
        //when
        int result = business.calculateSum(numbers);
        //then
        assertEquals(10, result);
    }
}
