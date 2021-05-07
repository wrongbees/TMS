package com.lesson5;

public class MilitaryAirTranspor extends AirTransport {

    boolean ejectionSystem;                            // наличие системы катапультирования
    int numberOfMissiles;                               // колличество ракет на борту

    public MilitaryAirTranspor(double horsePower, double maxSpeed, double weight,
                               String brand, int numberOfMissiles, boolean ejectionSystem,
                               double wingspan, double minRunwayStrip) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.ejectionSystem = ejectionSystem;
        this.wingspan = wingspan;
        this.numberOfMissiles = numberOfMissiles;
        this.minRunwayStrip = minRunwayStrip;

    }

    @Override
    public void representation() {
        String message = String.format("Данный военный авиа транспорт имеет следующие характеристики %n" +
                        " мощность: %s кВт %n максимальная скорость: %s км/ч %n вес транспортного средства: %s кг %n марка: %s %n" +
                        " наличие системы катапультирования %s %n " +
                        "колличество ракет на борту %s %n имеет размах крыльев %s м %n минимальная длина ВПП %s м",
                super.getKVT_Power(), maxSpeed, weight, brand, ejectionSystem, numberOfMissiles,
                wingspan, minRunwayStrip);

        System.out.println(message);

    }

    public void shot() {

        String message = (numberOfMissiles == 0) ? "Боеприпасы отсутствуют" : "Ракета пошла";
        numberOfMissiles--;
        System.out.println(message);

    }
}

