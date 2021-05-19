package com.Lesson6.robot.hands;

public class SamsungHand implements IHand {
    private  int prise;

    public SamsungHand(int prise) {
        this.prise = prise;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Samsung поднялась");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
