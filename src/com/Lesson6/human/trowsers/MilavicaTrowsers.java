package com.Lesson6.human.trowsers;

public class MilavicaTrowsers implements IntTrowsers {
    private int prise;

    public MilavicaTrowsers(int prise) {
        this.prise = prise;
    }

    public MilavicaTrowsers() {
    }

    @Override
    public void putOn() {
        System.out.println("Одевает штаны Milavica");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает штаны Milavica");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
