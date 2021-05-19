package com.Lesson6.baikanur.start;

import java.util.Random;

public class Shuttle implements IStart {

    public Shuttle() {
    }

    @Override
    public boolean systemCheck() {
        System.out.println("Checking oll system");
        return (new Random().nextInt(11) > 3);
    }

    @Override
    public void startEngine() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Shuttle Engines launched. All systems are normal.");
        Thread.sleep(1000);
    }

    @Override
    public void start() {
        System.out.println("Start of the Shuttle.");

    }
}
