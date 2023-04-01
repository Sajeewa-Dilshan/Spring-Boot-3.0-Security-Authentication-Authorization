package com.springboot3.security.springboot3security.repository;


import com.springboot3.security.springboot3security.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}
