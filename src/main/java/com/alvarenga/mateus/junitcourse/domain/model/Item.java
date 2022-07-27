package com.alvarenga.mateus.junitcourse.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Transient;

@Getter
@Setter
@ToString
@Entity
public class Item {
    @Id
    private Integer id;
    private String name;

    private int price;
    private int quantity;
    @Transient
    private int total;


    public Item() {
    }

    public Item(Integer id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        calculateTotal();
    }

    @PostLoad
    public void calculateTotal() {
        total = price * quantity;
    }
}
