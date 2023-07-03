package com.ifrspoa;

import org.junit.jupiter.api.Test;

import com.ifrspoa.crud.model.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {

    @Test
    void testGettersAndSetters() {
        Long id = 1L;
        String name = "Item 1";
        String count = "10";
        String status = "Active";

        Item item = new Item(id, name, count, status);

        assertEquals(id, item.getId());
        assertEquals(name, item.getName());
        assertEquals(count, item.getCount());
        assertEquals(status, item.getStatus());

        // Test setters
        Long newId = 2L;
        String newName = "Item 2";
        String newCount = "20";
        String newStatus = "Inactive";

        item.setId(newId);
        item.setName(newName);
        item.setCount(newCount);
        item.setStatus(newStatus);

        assertEquals(newId, item.getId());
        assertEquals(newName, item.getName());
        assertEquals(newCount, item.getCount());
        assertEquals(newStatus, item.getStatus());
    }
}

