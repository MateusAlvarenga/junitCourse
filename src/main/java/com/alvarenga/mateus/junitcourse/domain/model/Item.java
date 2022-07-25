package com.alvarenga.mateus.junitcourse.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Item {
    private int id;
    private String name;
    private int price;
    private int quantity;
}
