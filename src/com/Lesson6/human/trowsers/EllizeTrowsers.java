package com.Lesson6.human.trowsers;

public class EllizeTrowsers implements IntTrowsers {
    private int prise;

    public EllizeTrowsers(int prise) {
        this.prise = prise;
    }

    public EllizeTrowsers() {
    }

    @Override
    public void putOn() {
        System.out.println("Снимает штаны Ellize");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает штаны Ellise");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
