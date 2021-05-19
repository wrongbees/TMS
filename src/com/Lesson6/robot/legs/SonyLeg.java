package com.Lesson6.robot.legs;

public class SonyLeg implements ILeg {
    private int prise;

    public SonyLeg(int prise) {
        this.prise = prise;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Топает нога Sony");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
