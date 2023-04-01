package com.springboot3.security.springboot3security.controller;


import com.springboot3.security.springboot3security.entity.Item;
import com.springboot3.security.springboot3security.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public String saveItem(@RequestBody Item item){
        String s = itemService.saveItem(item);
        return s;

    }
}
