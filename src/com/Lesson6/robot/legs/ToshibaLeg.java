package com.Lesson6.robot.legs;

public class ToshibaLeg implements ILeg {
    private  int prise;

    public ToshibaLeg(int prise) {
        this.prise = prise;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Топает нога Toshiba");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
