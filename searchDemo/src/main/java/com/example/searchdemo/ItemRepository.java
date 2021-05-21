package com.example.searchdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(value = "SELECT * FROM mydb.items where " +
            "match(item_description, item_name) " +
            "against(?1)", nativeQuery = true)
    List<Item> findBy(String name);
}
