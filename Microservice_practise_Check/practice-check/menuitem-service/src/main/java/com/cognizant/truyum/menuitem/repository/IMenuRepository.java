package com.cognizant.truyum.menuitem.repository;

import com.cognizant.truyum.menuitem.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMenuRepository extends JpaRepository<MenuItem,Integer> {
}
