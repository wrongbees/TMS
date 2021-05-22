package com.Lesson7.task6;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private double price;
    private int maxSpeed;

    public Car(String brand, double price, int maxSpeed) {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void run() {

        System.out.printf("Автомобиль марки %s, стоимостью %s, умчался со скоростью %s",
                getBrand(), getPrice(), getMaxSpeed());
    }
}
