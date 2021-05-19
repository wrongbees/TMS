package com.Lesson6.baikanur.start;

import java.util.Random;

public class Pepelac implements IStart {
    public Pepelac() {
    }

    @Override
    public boolean systemCheck() throws InterruptedException {
        System.out.println("Проверка Пепелаца");
        Thread.sleep(1000);
        System.out.println("Лунц заправлен");
        Thread.sleep(1000);
        System.out.println("Скрипач на месте");
        if (new Random().nextBoolean()){
            return true;
        }
        System.out.println("Дядя Вова, папелац не полетит, гравицапу нужно покупать, родной");
        return false;
    }

    @Override
    public void startEngine() throws InterruptedException {
        System.out.println("Ку");
        Thread.sleep(1000);
        System.out.println("крутануть Гравицапу");
        Thread.sleep(1000);
        System.out.println("нажать Цапу");
        Thread.sleep(1000);
        System.out.println("Ку");


    }

    @Override
    public void start() {
        System.out.println("Пепелац переместился");

    }
}
