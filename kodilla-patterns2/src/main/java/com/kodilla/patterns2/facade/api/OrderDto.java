package com.kodilla.patterns2.facade.api;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    private final List<ItemDto> itemList = new ArrayList<>();

    public void addItem(final ItemDto itemDto) {
        itemList.add(itemDto);
    }

    public List<ItemDto> getItemList() {
        return itemList;
    }
}
