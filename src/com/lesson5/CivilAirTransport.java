package com.lesson5;

public class CivilAirTransport extends AirTransport {

    int quantityPassengers;                      // колличество пассажиров
    boolean businessСlass;                       // наличие бизнесс класса

    public CivilAirTransport(double horsePower, double maxSpeed, double weight,
                             String brand, int quantityPassengers, boolean businessСlass,
                             double wingspan, double minRunwayStrip){
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.businessСlass = businessСlass;
        this.wingspan = wingspan;
        this.quantityPassengers = quantityPassengers;
        this.minRunwayStrip = minRunwayStrip;

    }

    @Override
    public void representation() {
        String message = String.format("Данный пассажирский авиа транспорт имеет следующие характеристики %n" +
                    " мощность: %s кВт %n максимальная скорость: %s км/ч %n вес транспортного средства: %s кг %n марка: %s %n" +
                    " колличество пассажиров %s %n " +
                        "наличие бизнесс класса %s %n имеет размах крыльев %s м %n минимальная длина ВПП %s м",
             super.getKVT_Power(), maxSpeed, weight, brand, quantityPassengers, businessСlass,
                wingspan, minRunwayStrip);

        System.out.println(message);
    }

    public void loadingAvailable(int passengers){
        String message = (passengers <= quantityPassengers)? "Caмолёт загружен" : " Вам нужен самолет побольше";
        System.out.println(message);
    }
}
