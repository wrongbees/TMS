package com.lesson5;

public abstract class Transport {

    double horsePower;           //мощность в лошадях.
    double maxSpeed;             //скорость в км/ч.
    double weight;               //масса в кг.
    String brand;                // марка транспортного средства.

    public abstract void representation(); // метод представляющий поля класса

     double getKVT_Power(){         // метод перевода лошадей в киловаты.
        return 0.74*horsePower;
    }
}
