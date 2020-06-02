package com.leads.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Petar
 */
@Entity
@Table(name = "car")
public class Car implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "color")
    private String color;
    @JoinColumn(name = "engine_type_id", nullable = false, referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EngineType engineType;
    @JoinColumn(name = "car_brand_id", nullable = false, referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CarBrand carBrand;
    @JoinColumn(name = "car_brand_id", nullable = false, referencedColumnName = "id")
    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name="lead_car", joinColumns = @JoinColumn(name = "car_id"), inverseJoinColumns = @JoinColumn(name = "lead_id"))
    private CarModel carModel;

    public Car() {
    }

    public Car(Integer id, String color, EngineType engineType, CarBrand carBrand, CarModel carModel) {
        this.id = id;
        this.color = color;
        this.engineType = engineType;
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
}
