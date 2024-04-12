package com.lcwd.orm.entities;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_address")
public class Address {
    @Id
    private int addressId;

    private String street;
    private String country;
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
    public Address() {
    }

    public Address(int addressId, String street, String country) {
        this.addressId = addressId;
        this.street = street;
        this.country = country;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
