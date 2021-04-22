package com.firstExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lesson2 {

    public static void task1() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число в двоичной системе счисления");

            String binary = reader.readLine();
            boolean isBinary = false;
            try {
                int bin = Integer.parseInt(binary);
                isBinary = true;
            } catch (Exception e) {
                System.out.println("Неверный формат введенных данных");
            }


            if (isBinary) {
                int dec = 0;
                int count = 1;
                String[] binaryMus = binary.split("");
                for (int i = binary.length() - 1; i >= 0; i--) {
                    if (binaryMus[i].equals("1") || binaryMus[i].equals("0")) {
                        dec += count * Integer.parseInt(binaryMus[i]);
                        count *= 2;
                    } else {
                        System.out.println("Неверный формат введенных данных");
                        isBinary = false;
                        break;
                    }

                }
                if (isBinary) {
                    System.out.println(dec);
                }


            }
            System.out.println("Введите десятичное число");

            String number = reader.readLine();
            boolean isDec = false;
            try {
                int bin = Integer.parseInt(number);
                isDec = true;
            } catch (Exception e) {
                System.out.println("Неверный формат введенных данных");
            }
            if (isDec) {
                StringBuilder sb = new StringBuilder();
                int decNumber = Integer.parseInt(number);
                while (decNumber >= 1) {

                    if ((decNumber % 2) == 0) {
                        sb.append(0);
                    } else {
                        sb.append(1);
                    }
                    decNumber /= 2;

                }
                if (isDec) System.out.println(sb.reverse().toString());
            }
        }
    }

    public static void task2() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите четырехзначное действительное число");

            String numberStr;
            while ((numberStr = reader.readLine()).length() != 4) {
                System.out.println("Мы просили ЧЕТЫРЕХзначное");
            }
            int number = Integer.parseInt(numberStr);
            int n1, n2, n3, n4;

            n1 = number / 1000;
            n2 = (number / 100) % 10;
            n3 = (number % 100) / 10;
            n4 = number % 10;

            if (n1 != n2 & n1 != n3 & n1 != n4 & n2 != n3 & n3 != n4 & n2 != n4) {
                System.out.println("В составе числа одинаковых чисел не обнаружено");
            } else {
                System.out.println("В составе числа обнаружены одинаковые числа");
            }

        } catch (Exception e) {
            System.out.println("Неверный формат данных");
        }
    }

    public static void task3() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число");

            String numberStr = reader.readLine();
            // while ((numberStr = reader.readLine()).length() != 4){
            //    System.out.println("Мы просили значное");
            // }
            int number = Integer.parseInt(numberStr);
            String isEven = (number % 2 == 0) ? "четное" : "не четное";
            String lastIs7 = (number % 10 == 7) ? "семь" : "не семь";
            int count = 1;

            while (number > 10) {
                number /= 10;
                count++;
            }

            String is3number = (count == 3) ? "трехзначное" : "не трехзначное";

            System.out.printf("Введенное число %s и %s последняя цифра %s ", is3number, isEven, lastIs7);

        } catch (Exception e) {
            System.out.println("Неверный формат данных");
        }
    }


    public static void task4() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int[] parties = new int[3];

            System.out.println("Введите длины сторон предполагаемого треугольника ");

            for (int i = 0; i < parties.length; i++) {
                System.out.println("Сторона " + (i + 1));
                parties[i] = Integer.parseInt(reader.readLine());
            }

            if ((parties[0] < parties[1] + parties[2]) & (parties[1] < parties[0] + parties[2])
                    & (parties[2] < parties[0] + parties[1])) {
                System.out.println("Треугольник с такими сторонами существует");
            } else {
                System.out.println("Треугольник с такими сторонами не существует");
            }

        } catch (Exception e) {
            System.out.println("Не верный формат введенных данных");
        }
    }


    public static void task5() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите целое число");

            int number = Integer.parseInt(reader.readLine());

            boolean check = false;

            if (number == 0 & !check) {
                number = 10;
                check = !check;
            }

            if (number > 0 & !check) {
                number++;
                check = !check;
            }

            if (number < 0 & !check) {
                number -= 2;
                check = !check;
            }

            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Не верный формат введенных данных");
        }


    }

    public static void task6() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите два числа");

            System.out.print("Первое число :");
            int first = Integer.parseInt(reader.readLine());


            System.out.print("Первое число :");
            int second = Integer.parseInt(reader.readLine());

            System.out.println("Наибольшее число "+((first > second) ? first : second));

        } catch (Exception e) {
            System.out.println("Не верный формат введенных данных");
        }
    }

    public static void task7() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введем колличество програмистов");

            int quantity = Integer.parseInt(reader.readLine());

            String correctSuffix = " программист"; // 1 программист
            if (quantity >= 0 ){

                if (quantity == 0 || quantity >= 5) {
                    correctSuffix = " программистов";
                }else {
                    if( (2 <= quantity)& (quantity <= 4))
                    correctSuffix = " программиста";
                }
                System.out.println(quantity+correctSuffix);
            }else {
                System.out.println("Неа, слишком мало программистOFF");
            }


        } catch (Exception e) {
            System.out.println("Не верный формат введенных данных");
        }
    }


}
