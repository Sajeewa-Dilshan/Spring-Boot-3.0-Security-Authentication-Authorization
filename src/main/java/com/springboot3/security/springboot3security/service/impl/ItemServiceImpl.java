package com.springboot3.security.springboot3security.service.impl;

import com.springboot3.security.springboot3security.entity.Item;
import com.springboot3.security.springboot3security.repository.ItemRepository;
import com.springboot3.security.springboot3security.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public String saveItem(Item item) {
        Item save = itemRepository.save(item);
        System.out.println(save);
        return save.toString();
    }
}
