package com.lesson5;

public class WorldOfTransport {
    public static void main(String[] args) {
        //*****************************************************************
//        PassengerCar car = new PassengerCar(170, 250,
//                1700, "Skoda",4,6.7, "Combi", 4);
//
//        car.representation();
//        car.movementResult(2.5);
        //******************************************************************
//      CargoTransport truck = new CargoTransport(1500, 70, 10000, "MAZ",
//                6, 100, 5);
//
//        truck.representation();
//        truck.loadingAvailable(5.2);
//        *******************************************************************
//        CivilAirTransport plan = new CivilAirTransport(16000,1000,25000,"IL",
//                330,true, 50, 1500);
//
//        plan.representation();
//        plan.loadingAvailable(30);
        //******************************************************************
        MilitaryAirTranspor fighter = new MilitaryAirTranspor(15000,3000,
                20000, "Mig", 8,true,
                20, 1000);
        fighter.representation();
        fighter.shot();
    }
}
