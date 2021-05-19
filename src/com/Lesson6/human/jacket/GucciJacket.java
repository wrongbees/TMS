package com.Lesson6.human.jacket;

public class GucciJacket implements IntJacket {
    private int prise;

    public GucciJacket(int prise) {
        this.prise = prise;
    }

    public GucciJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Одевает куртку Gucci");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку Gucci");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
