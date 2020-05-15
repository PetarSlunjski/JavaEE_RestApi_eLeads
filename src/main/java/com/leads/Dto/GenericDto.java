package com.leads.Dto;

import java.io.Serializable;

/**
 * Created by Petar
 */
public class GenericDto<PK> implements Serializable {

    protected PK id;

    // constructors
    public GenericDto() {
        super();
    }

    public GenericDto(PK id) {
        this.id = id;
    }

    // getters and setters
    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }

}
