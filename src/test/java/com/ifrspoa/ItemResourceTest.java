package com.ifrspoa;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.ifrspoa.crud.model.Item;
import com.ifrspoa.crud.resource.ItemResource;
import com.ifrspoa.crud.service.ItemService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ItemResourceTest {

    @Mock
    private ItemService itemService;

    @InjectMocks
    private ItemResource itemResource;

    @Test
    void testGet() {
        List<Item> expectedItems = new ArrayList<>();
        when(itemService.get()).thenReturn(expectedItems);

        List<Item> items = itemResource.get();

        assertEquals(expectedItems, items);
        verify(itemService, times(1)).get();
    }

    @Test
    void testCreate() {
        Item item = new Item(1L, "Item 1", "10", "Active");

        itemResource.create(item);

        verify(itemService, times(1)).create(item);
    }

    @Test
    void testUpdate() {
        Item item = new Item(1L, "Item 1", "10", "Active");

        itemResource.update(item);

        verify(itemService, times(1)).update(item);
    }

    @Test
    void testDelete() {
        Long id = 1L;

        itemResource.delete(id);

        verify(itemService, times(1)).delete(id);
    }
}
