package com.Lesson6.baikanur;

import com.Lesson6.baikanur.start.IStart;
import com.Lesson6.baikanur.start.Pepelac;
import com.Lesson6.baikanur.start.Shuttle;

public class Сosmodrome {
    public static void launch(IStart exemplar) throws InterruptedException {

        if(!exemplar.systemCheck()){
            Thread.sleep(2000);
            System.out.println("Prelaunch check failed");
            return;
        }

        countdown();
        exemplar.startEngine();
        exemplar.start();

    }

    private static void countdown() throws InterruptedException {
        System.out.println("Start engine");
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        launch(new Pepelac());
    }
}
