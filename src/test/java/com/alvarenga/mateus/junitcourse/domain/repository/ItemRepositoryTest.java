package com.alvarenga.mateus.junitcourse.domain.repository;


import com.alvarenga.mateus.junitcourse.domain.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Mock
    private ItemRepository itemRepository;

    @Test
    public void findAllTest() {
        when(itemRepository.findAll())
                .thenReturn( new ArrayList<Item>() {
                    {
                        add(new Item(1, "Item 1", 100, 20));
                        add(new Item(2, "Item 2", 200, 40));
                        add(new Item(3, "Item 3", 300, 60));
                    }
                });
        //when
        var result =itemRepository.findAll();
        //then
        assert result.size() == 3;
    }

}
