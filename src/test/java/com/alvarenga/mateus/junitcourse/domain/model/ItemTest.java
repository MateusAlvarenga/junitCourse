package com.alvarenga.mateus.junitcourse.domain.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ItemTest {

    @Test
    public void testItem() {
        Item item = new Item(1, "Item 1", 100, 20);
        assert item.getId() == 1;
        assert item.getName().equals("Item 1");
        assert item.getPrice() == 100;
        assert item.getQuantity() == 20;
        assert item.getTotal() == 2000;
    }
}
