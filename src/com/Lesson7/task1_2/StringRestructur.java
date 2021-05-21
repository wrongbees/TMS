package com.Lesson7.task1_2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringRestructur {

    public static void task1() {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Введите текст (строку)");
        String text = scanner.nextLine();

        System.out.println("Введите первый символ");
        String first = scanner.nextLine();

        System.out.println("Введите второй символ");
        String second = scanner.nextLine();
//проверка на наличие символов в строке
        if (text.indexOf(first) < 0 | text.indexOf(second) < 0) {

            System.out.println("Возможно некоторые вводимые символы в строке отсутствуют");

        } else {
            if (text.indexOf(first) > text.indexOf(second)) {// если случайно первый элемент входит в подстроку вторым
                StringRestructur.cutter(text, second, first);
            } else {
                StringRestructur.cutter(text, first, second);
            }
        }
    }

    // непосредственно сам метод который нужно создать для task1
    private static void cutter(String text, String first, String second) {

        System.out.println(new StringBuilder(text).delete(text.indexOf(first), text.indexOf(second)));

    }

    public static void task2() throws IOException {
        // почему то через Scanner не получилось
        //  в блоке try - cach  происходило зацикливание
       try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

        System.out.println("Введите текст (строку)");
        String text = reader.readLine();

        int first;
        do {
            System.out.println("Введите индекс заменяемого символа");

            try {                                             // блок проверки не является ли индекс строкой
                first = Integer.parseInt(reader.readLine());  // и не выходит ли за пределы возможных индексов строки
            } catch (Exception e) {
                System.out.println("чё то не то");
                first = -1;
            }
        } while (first < 0 | first > text.length());


        int second;
        do {
            System.out.println("Введите индекс замещающего символа");
            try {                                   // блок проверки не является ли индекс строкой
                second =  Integer.parseInt(reader.readLine());          // и не выходит ли за пределы возможных индексов строки
            } catch (Exception e) {
                System.out.println("чё то не то");
                second = -1;
            }
        } while (second < 0 | second > text.length());
        StringRestructur.replacer(text, first, second);
    }
    }

    private static void replacer(String text, int first, int second){
        System.out.println(text.replace(text.charAt(first), text.charAt(second)));
    }
}
