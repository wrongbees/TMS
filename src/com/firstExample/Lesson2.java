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
                System.out.println("Не верный формат введенных данных");
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
                System.out.println("Не верный формат введенных данных");
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

}
