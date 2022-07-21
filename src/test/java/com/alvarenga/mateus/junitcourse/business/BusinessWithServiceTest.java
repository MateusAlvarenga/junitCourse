package com.alvarenga.mateus.junitcourse.business;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class BusinessWithServiceTest {
   @Mock
   SomeDataService someDataService;
   @InjectMocks
   BusinessWithServiceImpl business;


    @Test
    public void testCalculateSum() {
        // given
        when(someDataService.getNumbers()).thenReturn(new int[]{5,5,5});
        //when
        int result = business.calculateSum();
        //then
        assertEquals(15, result);
    }

    @Test
    public void testCalculateSumEmpty() {
        // given
        when(someDataService.getNumbers()).thenReturn(new int[]{});
        //when
        int result = business.calculateSum();
        //then
        assertEquals(0, result);
    }

    @Test
    public void testCalculateSumOneValue() {
        // given
        when(someDataService.getNumbers()).thenReturn(new int[]{10});
        //when
        int result = business.calculateSum();
        //then
        assertEquals(10, result);
    }
}
