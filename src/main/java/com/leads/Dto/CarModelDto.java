package com.leads.Dto;

/**
 * Created by Petar
 */
public class CarModelDto extends GenericDto<Integer> {

    private Integer id;
    private String name;

    public CarModelDto() {
    }

    public CarModelDto(Integer id, String name) {
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
