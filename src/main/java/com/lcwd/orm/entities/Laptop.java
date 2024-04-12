package com.lcwd.orm.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_laptops")
public class Laptop {
    @Id
    private int laptopId;
    private String modeNumber;
    private String brand;



    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
    public Laptop() {
    }

    public Laptop(int laptopId, String modeNumber, String brand, Student student) {
        this.laptopId = laptopId;
        this.modeNumber = modeNumber;
        this.brand = brand;
        this.student = student;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModeNumber() {
        return modeNumber;
    }

    public void setModeNumber(String modeNumber) {
        this.modeNumber = modeNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
