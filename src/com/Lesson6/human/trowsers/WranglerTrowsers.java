package com.Lesson6.human.trowsers;

public class WranglerTrowsers implements IntTrowsers {
    private  int prise;

    public WranglerTrowsers(int prise) {
        this.prise = prise;
    }

    public WranglerTrowsers() {

    }

    @Override
    public void putOn() {
        System.out.println("Одевает штаны Wrangler");
    }

    @Override
    public void takeOff() {
        System.out.println("Cнимает штаны Wrangler");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
