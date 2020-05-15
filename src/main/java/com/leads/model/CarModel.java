package com.leads.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "car_model")
public class CarModel implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

    public CarModel() {
    }

    public CarModel(Integer id) {
        this.id = id;
    }

    public CarModel(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
