package com.alvarenga.mateus.junitcourse.domain.repository;

import com.alvarenga.mateus.junitcourse.domain.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    public Item findFirstByOrderByIdAsc();
}
