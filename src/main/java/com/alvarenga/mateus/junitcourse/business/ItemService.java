package com.alvarenga.mateus.junitcourse.business;

import com.alvarenga.mateus.junitcourse.domain.model.Item;
import com.alvarenga.mateus.junitcourse.domain.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequestMapping("/api/item")
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item findItem(Integer id) {
        return itemRepository.findById(id).orElse(null);
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item getFirst() {
        return itemRepository.findFirstByOrderByIdAsc();
    }

    public Item save(Item item) {
        return  itemRepository.save(item);
    }
}
