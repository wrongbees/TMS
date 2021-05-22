package com.Lesson7.task6;

import java.io.*;

public class CarSerializator {
    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/test/object.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/test/object.txt"))) {

            Car firstCar = new Car("Lada", 1234.56,150);
            oos.writeObject(firstCar);

            Car secondCar = (Car) ois.readObject();
            secondCar.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
