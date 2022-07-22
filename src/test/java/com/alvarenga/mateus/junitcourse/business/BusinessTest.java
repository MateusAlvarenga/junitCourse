package com.alvarenga.mateus.junitcourse.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BusinessTest {

    @InjectMocks
    BusinessImpl business;

    @Test
    public void testCalculateSum() {
        // given
        int[] numbers = {5,5,5};
        //when
        int result = business.calculateSum(numbers);
        //then
        assertEquals(15, result);
    }

    @Test
    public void testCalculateSumEmpty() {
        // given
        int[] numbers = {};
        //when
        int result = business.calculateSum(numbers);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testCalculateSumOneValue() {
        // given
        int[] numbers = {10};
        //when
        int result = business.calculateSum(numbers);
        //then
        assertEquals(10, result);
        
       
    }
}
