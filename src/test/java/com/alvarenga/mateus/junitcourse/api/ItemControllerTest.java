package com.alvarenga.mateus.junitcourse.api;

import com.alvarenga.mateus.junitcourse.business.ItemService;
import com.alvarenga.mateus.junitcourse.domain.model.Item;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {


    @MockBean
    ItemService itemService;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

   @Test
    public void item() throws Exception {

        Item itemTest = new Item(1, "Item 1", 10,20);

        when(itemService.getFirst())
                .thenReturn(itemTest);

        RequestBuilder request = MockMvcRequestBuilders
                .get("/api/item/first")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult Response = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andReturn();

        JSONAssert.assertEquals(
                Response.getResponse().getContentAsString(),
                objectMapper.writeValueAsString(itemTest), true);
    }


}
