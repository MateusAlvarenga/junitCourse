package com.alvarenga.mateus.junitcourse.business;

import com.alvarenga.mateus.junitcourse.domain.model.Item;
import com.alvarenga.mateus.junitcourse.domain.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {

   @Mock
   private ItemRepository itemRepository;
   @InjectMocks
   private ItemService itemService;


    @Test
    public void  findItemTest() {
        when(itemRepository.findById(anyInt()))
                .thenReturn(Optional.of(new Item(1, "Item 1", 100, 20)));
        //when
        var result = itemService.findItem(1);
        //then
        assert result.getId() == 1;


    }
}
