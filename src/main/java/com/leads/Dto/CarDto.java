package com.leads.Dto;

/**
 * Created by Petar
 */
public class CarDto extends GenericDto<Integer> {

    private Integer id;
    private String color;
    private CarBrandDto carBrandDto;
    private CarModelDto carModelDto;
    private EngineTypeDto engineTypeDto;

    public CarDto() {
    }

    public CarDto(Integer id, String color, CarBrandDto carBrandDto, CarModelDto carModelDto, EngineTypeDto engineTypeDto) {
        this.id = id;
        this.color = color;
        this.carBrandDto = carBrandDto;
        this.carModelDto = carModelDto;
        this.engineTypeDto = engineTypeDto;
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

    public CarBrandDto getCarBrandDto() {
        return carBrandDto;
    }

    public void setCarBrandDto(CarBrandDto carBrandDto) {
        this.carBrandDto = carBrandDto;
    }

    public CarModelDto getCarModelDto() {
        return carModelDto;
    }

    public void setCarModelDto(CarModelDto carModelDto) {
        this.carModelDto = carModelDto;
    }

    public EngineTypeDto getEngineTypeDto() {
        return engineTypeDto;
    }

    public void setEngineTypeDto(EngineTypeDto engineTypeDto) {
        this.engineTypeDto = engineTypeDto;
    }
}
