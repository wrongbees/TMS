package com.Lesson6.robot.hands;

public class ToshibaHand implements IHand {
    private int prise;

    public ToshibaHand(int prise) {
        this.prise = prise;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднялась");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}

