package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "manufacture")
public class Manufacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "manufactures_name")
    private String manufacturesName;

    @OneToMany(mappedBy = Bike_.MANUFACTURE)
    private Set<Bike> bikes;

    public Manufacture() {
    }

    public Manufacture(String manufacturesName, Set<Bike> bikes) {
        this.manufacturesName = manufacturesName;
        this.bikes = bikes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturesName() {
        return manufacturesName;
    }

    public void setManufacturesName(String manufacturesName) {
        this.manufacturesName = manufacturesName;
    }

    public Set<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(Set<Bike> bikes) {
        this.bikes = bikes;
    }
}
