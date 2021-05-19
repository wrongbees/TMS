package com.Lesson6.robot;

import com.Lesson6.robot.hands.SamsungHand;
import com.Lesson6.robot.hands.SonyHand;
import com.Lesson6.robot.hands.ToshibaHand;
import com.Lesson6.robot.heads.SamsungHead;
import com.Lesson6.robot.heads.SonyHead;
import com.Lesson6.robot.heads.ToshibaHead;
import com.Lesson6.robot.legs.SamsungLeg;
import com.Lesson6.robot.legs.SonyLeg;
import com.Lesson6.robot.legs.ToshibaLeg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        List<Robot> robots = new ArrayList<>();

        Robot robot1 = new Robot(new SamsungHead(5000), new SonyHand(1000), new ToshibaLeg(2000));
        Robot robot2 = new Robot(new SonyHead(5500), new ToshibaHand(2000), new SamsungLeg(1900));
        Robot robot3 = new Robot(new ToshibaHead(5400), new SamsungHand(1500), new SonyLeg(2100));

        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);

        Robot exspensiv = robot1;
        int index = 1;
        for (Robot everyone : robots) {
            System.out.println("Робот "+index++);
            everyone.action();
            System.out.println();
            if (everyone.getPrice() > exspensiv.getPrice()) {
                exspensiv = everyone;
            }
        }

        System.out.printf("Самый дорогой из созданных роботов имеет комплектацию: \n " +
                "голова - %s , рука - %s, нога - %s",exspensiv.getHand().getClass().getSimpleName(),
                   exspensiv.getHead().getClass().getSimpleName(),
                        exspensiv.getLeg().getClass().getSimpleName());


    }
}
