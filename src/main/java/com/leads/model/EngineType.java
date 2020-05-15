package com.leads.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "engine_type")
public class EngineType implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

    public EngineType() {
    }

    public EngineType(Integer id) {
        this.id = id;
    }

    public EngineType(Integer id, String name) {
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
