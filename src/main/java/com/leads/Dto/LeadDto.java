package com.leads.Dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Petar
 */
public class LeadDto extends GenericDto<Integer> {

    private Integer id;
    private String firstName;
    private String lastName;
    private String city;
    private List<CarDto> carLst = new ArrayList<>();

    public LeadDto() {
    }

    public LeadDto(Integer id, String firstName, String lastName, String city, List<CarDto> carLst) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.carLst = carLst;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<CarDto> getCarLst() {
        return carLst;
    }

    public void setCarLst(List<CarDto> carLst) {
        this.carLst = carLst;
    }
}
