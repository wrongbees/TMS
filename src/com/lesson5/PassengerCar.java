package com.lesson5;

public class PassengerCar extends LandTransport{

    String bodyType;                             // тип кузова
    int quantityPassengers;                      // колличество пассажиров

    public PassengerCar(double horsePower, double maxSpeed, double weight,
                        String brand, int numberOfWheels, double fuelConsumption,
                          String bodyType, int quantityPassengers){
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.bodyType = bodyType;
        this.quantityPassengers = quantityPassengers;

    }



    @Override
    public void representation() {
        String message = String.format("Данный пассажирский транспорт имеет следующие характеристики %n" +
                " мощность: %s кВт %n максимальная скорость: %s км/ч %n вес транспортного средства: %s кг %n марка: %s %n" +
                " тип кузова %s %n колличество пассажиров: %s %n колличество колёс %s %n расход топлива на 100км %s"
                , super.getKVT_Power(), maxSpeed, weight, brand, bodyType, quantityPassengers, numberOfWheels, fuelConsumption);

        System.out.println(message);

    }

    public void movementResult(double time){
        String message = String.format("     За время %s ч. автомобиль марки %s, двигаясь " +
                "с максимальной скоростью %s км/ч. %n проедет %s км и израсходует %s литров топлива",
                time, brand, maxSpeed, time * maxSpeed, fuelСonsumption(time));

        System.out.println(message);
    }

    private double fuelСonsumption(double time){
        return (time * maxSpeed)*fuelConsumption/100;
    }

}
