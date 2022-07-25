package com.alvarenga.mateus.junitcourse.api;

import com.alvarenga.mateus.junitcourse.domain.model.Item;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    private final String json = "{id:1,name:'Item 1',price:100,quantity:20}";
    ObjectMapper mapper = new ObjectMapper();

    @Test
    @SneakyThrows
    public void test() {

        Item item = new Item(1,"Item 1", 100,20);
        JSONAssert.assertEquals(json, mapper.writeValueAsString(item),false);

    }
}
