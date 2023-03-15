package com.arcadag.cardatabase.domain;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand, model, color, registerNumber;
    @Column(name = "'year'")
    private int year;
    private int price;
    public Car() {}

    public Car(String brand, String model, String color, String registerNumber, int year, int price) {
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }
}
