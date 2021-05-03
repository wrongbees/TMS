package com.firstExample;

public class Lesson4 {
    public static void main(String[] args) throws InterruptedException {
        Computer computer = new Computer();
        computer.presentation();

        while (computer.isLive()){
            computer.turningOn();
            computer.turningOf();
        }
    }
}
