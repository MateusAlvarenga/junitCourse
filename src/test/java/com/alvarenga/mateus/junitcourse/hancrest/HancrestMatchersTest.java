package com.alvarenga.mateus.junitcourse.hancrest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import static org.assertj.core.api.Assertions.assertThat;


public class HancrestMatchersTest {

    @Test
    public void hancrestMatchersTest() {
        // TODO
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer biggestNumber = numbers.stream()
                .reduce(Integer::max)
                .orElseThrow(IllegalStateException::new);
        Integer number = 10;

        assertThat(numbers).hasSize(5);
        assertThat(number).isGreaterThan(5);
        assertThat(number).isGreaterThan(biggestNumber);
        assertThat(numbers).containsExactly(1, 2, 3, 4, 5);

        assertThat(numbers)
                .allMatch(n -> n > 0)
                .allMatch(n -> n < 10);
    }
}
