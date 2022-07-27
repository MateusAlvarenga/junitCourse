package com.alvarenga.mateus.junitcourse.hancrest;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;

// full reference in https://github.com/json-path/JsonPath
public class JSONpathParserTest {

    private final String json = "[{\"id\":1,\"name\":\"Item 1\",\"price\":100,\"quantity\":20}," +
            "                   {\"id\":2,\"name\":\"Item 2\",\"price\":200,\"quantity\":40}," +
            "                   {\"id\":3,\"name\":\"Item 3\",\"price\":300,\"quantity\":60}]";


    @Test
    public void testJSONpathParser() {

        DocumentContext context = JsonPath.parse(json);
        var result = context.read("$.[0].name");
        var length = context.read("$.length()");
        List<Integer> prices = (ArrayList) context.read("$.[*].price");
        List<Integer> quantities = (ArrayList) context.read("$.[*].quantity");

        assertThat(result).isEqualTo("Item 1");
        assertThat(length).isEqualTo(3);
        assertThat(prices).containsExactly(100, 200, 300);
        assertThat(quantities).containsExactly(20, 40, 60);
    }
}
