package com.cognizant.truyum.menuitem.controller;

import com.cognizant.truyum.menuitem.model.MenuItem;
import com.cognizant.truyum.menuitem.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuItemController {
    @Autowired
    private MenuItemService service;
    @GetMapping(path = "/menuitems")
    public List<MenuItem> getAll(){
        return service.getAll();
    }
}
