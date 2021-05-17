package com.Lesson6.human.shoes;

public class MarcoShoes implements IntShoes {
    private int prise;

    public MarcoShoes(int prise) {
        this.prise = prise;
    }

    public MarcoShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Одевает обувь Marco");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает обувь Marco");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
