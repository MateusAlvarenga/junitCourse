package com.alvarenga.mateus.junitcourse.business;

import com.alvarenga.mateus.junitcourse.domain.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    public Item findItem(int id) {
        return new Item(id, new StringBuilder("Item ").append(id).toString() , 100,20);
    }

    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add(new Item(i, new StringBuilder("Item ").append(i).toString() , 100,20));
        }
        return items;
    }

    public Item getFirst() {
        return new Item(1, new StringBuilder("Item ").append(1).toString() , 100,20);
    }



}
