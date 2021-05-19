package com.Lesson6.robot.heads;

public class SamsungHead implements IHead {
    private int prise;

    public SamsungHead(int prise) {
        this.prise = prise;
    }

    public SamsungHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");

    }

    @Override
    public int getPrice() {
        return prise;
    }
}
