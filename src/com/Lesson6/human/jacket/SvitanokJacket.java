package com.Lesson6.human.jacket;

public class SvitanokJacket implements IntJacket {
    private int prise;

    public SvitanokJacket(int prise) {
        this.prise = prise;
    }

    public SvitanokJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Одевает куртку Svitanok");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку Svitanok");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
