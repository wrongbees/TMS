package com.Lesson6.robot.hands;

public class SonyHand implements IHand {
    private int prise;

    public SonyHand(int prise) {
        this.prise = prise;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Sony поднялась");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
