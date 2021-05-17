package com.Lesson6.human.shoes;

public class BelwestShoes implements IntShoes {
    private int prise;

    public BelwestShoes(int prise) {
        this.prise = prise;
    }

    public BelwestShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Одеваем обувь Belwest");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем обувь Belwest");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
