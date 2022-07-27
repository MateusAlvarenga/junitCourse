package com.alvarenga.mateus.junitcourse.api;

import com.alvarenga.mateus.junitcourse.business.ItemService;
import com.alvarenga.mateus.junitcourse.domain.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<?> item() {
        return ResponseEntity.ok(itemService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(itemService.findItem(id));
    }

    @GetMapping("/first")
    public ResponseEntity<?> first() {
        return ResponseEntity.ok(itemService.getFirst());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.save(item));
    }

}
