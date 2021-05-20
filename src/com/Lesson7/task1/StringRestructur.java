package com.Lesson7.task1;


import java.util.Scanner;

public class StringRestructur {

    public static void task1(){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Введите текст (строку)");
        String text = scanner.nextLine();

        System.out.println("Введите первый символ");
        String first = scanner.nextLine();

        System.out.println("Введите второй символ");
        String second = scanner.nextLine();
//проверка на наличие символов в строке
        if (text.indexOf(first) < 0 | text.indexOf(second) < 0){

            System.out.println("Возможно некоторые вводимые символы в строке отсутствуют");

        } else {
            if (text.indexOf(first) > text.indexOf(second) ){// если случайно первый элемент входит в подстроку вторым
                StringRestructur.cutter(text,second,first);
            }else{
                StringRestructur.cutter(text,first,second);
            }
        }
    }
    // непосредственно сам метод который нужно создать для task1
    private static void cutter(String text, String first, String second){

        System.out.println(text.substring(text.indexOf(first),text.indexOf(second)));

    }
}
