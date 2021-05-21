package com.example.searchdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemRepository repo;

    @Autowired
    private ItemService service;

    @GetMapping("/items_list")
    public String listItems(Model model){
        List<Item> items = repo.findAll();
        model.addAttribute("listItems", items);

        return "items";

    }

    @GetMapping("/search")
    public String searchItem(@Param("search") String search, Model model){
        model.addAttribute("search", search);
        model.addAttribute("pageTitle", "Search results for '" + search + "'");
        model.addAttribute("listItems", service.searchByName(search));
        return "search_result";
    }
}
