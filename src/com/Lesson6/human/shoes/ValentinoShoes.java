package com.Lesson6.human.shoes;

public class ValentinoShoes implements IntShoes {
    private int prise;

    public ValentinoShoes(int prise) {
        this.prise = prise;
    }

    public ValentinoShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Одевает обувь Valentino");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает обувь Valentino");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
