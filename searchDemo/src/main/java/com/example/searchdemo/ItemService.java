package com.example.searchdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repo;

    public List<Item> searchByName(String name){
        return repo.findBy("%"+name+"%");
    }
}
