package com.springboot3.security.springboot3security.controller;

import com.springboot3.security.springboot3security.dto.Product;
import com.springboot3.security.springboot3security.entity.UserInfo;
import com.springboot3.security.springboot3security.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class SampleController {

    private final ProductService productService;

    @GetMapping("/welcome")
    public String getString(){
        return "Hello World";
    }


    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return productService.addUser(userInfo);
    }

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Product> getAllTheProducts() {
        return List.of(new Product(1,"Monitor",1,45000));
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER') OR hasAuthority('ROLE_ADMIN')")
    public Product getProductById(@PathVariable int id) {
        return null;
    }

}
