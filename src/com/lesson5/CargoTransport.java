package com.lesson5;

public class CargoTransport extends LandTransport {

    double carryingCapacity;                      // грузоподъёмность(т.)

    public CargoTransport(double horsePower, double maxSpeed, double weight,
                          String brand, int numberOfWheels, double fuelConsumption,
                           double carryingCapacity){
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.carryingCapacity = carryingCapacity;

    }

    @Override
    public void representation() {
        String message = String.format("Данный грузовой транспорт имеет следующие характеристики %n" +
                        " мощность: %s кВт %n максимальная скорость: %s км/ч %n вес транспортного средства: %s кг %n марка: %s %n" +
                        " грузоподъемность %s т %n колличество колёс %s %n расход топлива на 100км %s"
                , super.getKVT_Power(), maxSpeed, weight, brand, carryingCapacity, numberOfWheels, fuelConsumption);

        System.out.println(message);

    }

    public void loadingAvailable(double mass){
        String message = (mass <= carryingCapacity)? "Грузовик загружен" : " Вам нужен грузовик побольше";
        System.out.println(message);
    }
}
