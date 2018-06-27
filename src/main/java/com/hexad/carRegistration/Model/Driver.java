package com.hexad.carRegistration.Model;


import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class Driver {


    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String address;

    public Driver() {
    }

    public Driver(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
