package com.hexad.carRegistration.Model;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String model;
    @Column
    private String make;
    @Column
    private Integer year;
    @Column
    private String reg;

    public Car() {
    }

    public Car(String model, String make, Integer year, String reg) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.reg = reg;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getReg() {
        return reg;
    }

    public long getId() {
        return id;
    }
}
