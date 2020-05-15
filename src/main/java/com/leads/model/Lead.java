package com.leads.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Petar
 */
@Entity
@Table(name = "lead")
public class Lead implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "city")
    private String city;

}
