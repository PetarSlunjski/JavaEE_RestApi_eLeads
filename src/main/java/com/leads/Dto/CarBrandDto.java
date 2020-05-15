package com.leads.Dto;

/**
 * Created by Petar
 */
public class CarBrandDto extends GenericDto<Integer> {

    private Integer id;
    private String Name;

    public CarBrandDto() {
    }

    public CarBrandDto(Integer id, String name) {
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
