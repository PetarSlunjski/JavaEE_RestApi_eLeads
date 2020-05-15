package com.leads.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Petar
 */
@Entity
@Table(name = "car_brand")
public class CarBrand implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String Name;

    public CarBrand() {
    }

    public CarBrand(Integer id) {
        this.id = id;
    }

    public CarBrand(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
