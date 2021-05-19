package com.Lesson6.human;

import com.Lesson6.human.jacket.IntJacket;
import com.Lesson6.human.shoes.IntShoes;
import com.Lesson6.human.trowsers.IntTrowsers;



public class Human implements IntHuman{
    private String name;
    private IntJacket jacket;
    private IntTrowsers trowsers;
    private IntShoes shoes;

    public Human(String name, IntJacket jacket, IntTrowsers trowsers, IntShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.trowsers = trowsers;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }


    public IntJacket getJacket() {
        return jacket;
    }

    public void setJacket(IntJacket jacket) {
        this.jacket = jacket;
    }

    public IntTrowsers getTrowsers() {
        return trowsers;
    }

    public void setTrowsers(IntTrowsers trowsers) {
        this.trowsers = trowsers;
    }

    public IntShoes getShoes() {
        return shoes;
    }

    public void setShoes(IntShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void dressed() {
        jacket.putOn();
        trowsers.putOn();
        shoes.putOn();
    }

    @Override
    public void undressed() {
        jacket.takeOff();
        trowsers.takeOff();
        shoes.takeOff();

    }

    @Override
    public int getDressPrice() {
        return jacket.getPrice() + trowsers.getPrice() + shoes.getPrice();
    }
}
