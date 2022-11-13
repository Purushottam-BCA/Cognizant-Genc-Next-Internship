package com.cognizant.truyum.menuitem.service;

import com.cognizant.truyum.menuitem.model.MenuItem;
import com.cognizant.truyum.menuitem.repository.IMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {
    @Autowired
    private IMenuRepository repository;

    public List<MenuItem> getAll(){
        return repository.findAll();
    }

    public MenuItem getById(int id){
        return repository.findById(id).orElse(null);
    }
}
