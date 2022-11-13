package com.cognizant.truyum.menuitem.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menu_items")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price", columnDefinition = "decimal", precision = 8,scale = 2)
    private double price;
    @Column(name = "date_of_launch")
    private Date dateOfLaunch;
    @Column(name = "active")
    private String active;

    @Column(name = "category")
    private String category;
    @Column(name = "free_delivery")
    private String freeDelivery;

}
