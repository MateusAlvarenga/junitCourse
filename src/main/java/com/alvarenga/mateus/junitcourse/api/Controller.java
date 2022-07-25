package com.alvarenga.mateus.junitcourse.api;

import com.alvarenga.mateus.junitcourse.domain.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/item")
    public Item item() {
        return new Item(1,"Item 1", 100,20);
    }
}
