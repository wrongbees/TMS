package com.Lesson6.human;

import com.Lesson6.human.jacket.GucciJacket;
import com.Lesson6.human.jacket.PradaJacket;
import com.Lesson6.human.jacket.SvitanokJacket;
import com.Lesson6.human.shoes.BelwestShoes;
import com.Lesson6.human.shoes.MarcoShoes;
import com.Lesson6.human.shoes.ValentinoShoes;
import com.Lesson6.human.trowsers.EllizeTrowsers;
import com.Lesson6.human.trowsers.MilavicaTrowsers;
import com.Lesson6.human.trowsers.WranglerTrowsers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunHuman {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();

        Human human1 = new Human("Vasil",new GucciJacket(200),
                new EllizeTrowsers(50),new BelwestShoes(30));
        Human human2 = new Human("Anatol", new PradaJacket(300),
                new WranglerTrowsers(100), new ValentinoShoes(300));
        Human human3 = new Human("Alfred", new SvitanokJacket(70),
                new MilavicaTrowsers(100), new MarcoShoes(250));

        humans.add(human1);
        humans.add(human2);
        humans.add(human3);

        Human expensive = human1;
        for(Human one: humans){
            System.out.println(one.getName());
            one.dressed();
            one.undressed();
            System.out.println();

            if (one.getDressPrice() > expensive.getDressPrice()){
                expensive = one;
            }

        }
        System.out.println("Круче всех прикинулся "+ expensive.getName());
    }
}
