package com.Lesson6.robot.legs;

public class SamsungLeg implements ILeg {
    private int prise;

    public SamsungLeg(int prise) {
        this.prise = prise;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Топает нога Samsung");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
