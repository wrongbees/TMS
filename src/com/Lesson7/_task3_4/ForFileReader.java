package com.Lesson7._task3_4;

import jdk.jfr.events.FileReadEvent;

import java.io.*;

public class ForFileReader {
    private static void task1() {

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

    public static void main(String[] args) {
        ForFileReader.task1();
    }
}
