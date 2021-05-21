package com.Lesson7._task3_4;

import jdk.jfr.events.FileReadEvent;

import java.io.*;

public class ForFileReader {
    private static void task3() {

        try (BufferedReader reader = new BufferedReader(new FileReader("e:/test/source.txt"));
             FileWriter writer = new FileWriter("e:/test/result.txt")) {

            while (reader.ready()) {
                String str = reader.readLine();
                if (TextFormater.isPalindrome(str)) {
                    writer.write(str);
                    writer.write(10);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task4() {
        try (FileReader reader = new FileReader("e:/test/source.txt");
             FileWriter writer = new FileWriter("e:/test/result.txt",false)) {

            int oneByte;
            while (reader.ready()) {
                StringBuilder sb = new StringBuilder();
                while ((oneByte = reader.read()) != 46 & oneByte != -1 & oneByte != 63 & oneByte != 33) {

                    sb.append((char)oneByte);

                }

                String[] stringArray = sb.toString().trim().split("\\s*(\\s|,|!|\\.|\\?|\\(|\\)|;|:)\\s*");

                int worldCount = TextFormater.wordСount(stringArray);
                if (TextFormater.searchPalindrome(stringArray) |
                        ( worldCount >= 3 & worldCount < 5)){
                writer.write(sb.toString());
                writer.write(10);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        // ForFileReader.task3();
        ForFileReader.task4();
    }
}
