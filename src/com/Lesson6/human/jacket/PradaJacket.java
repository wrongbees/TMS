package com.Lesson6.human.jacket;

public class PradaJacket implements IntJacket {
    private int prise;

    public PradaJacket(int prise) {
        this.prise = prise;
    }

    public PradaJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Одевает куртку Prada");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку Prada");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
