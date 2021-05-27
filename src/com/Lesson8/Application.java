package com.Lesson8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Application {
    private static Shop shop = new Shop();
    private static boolean alive = true;

    //метод вывод всех товаров
    private static void displayOfAllProducts() {
        System.out.println("*********************************");
        System.out.println("Вывести товары по:\n" +
                "     [1] по цене(возростание);\n" +
                "     [2] по цене(убывание);\n" +
                "     [3] по добавлению(сначала новые, потом более старые);\n" +
                "     [4] вернуться в предыдущее меню;");

        List<Product> list = shop.getAllProduct();
        switch (consoleIntReader(4)) { // consoleIntReader(4) принимает с консоли цифры до 4

            case (1):
                list.sort(new PriceComparator());
                printList(list, false);
                break;
            case (2):
                list.sort(new PriceDownComparator());
                printList(list, false);
                break;
            case (3):
                printList(list, true);
                break;

        }
    }

    // добавление продукта
    private static void addingProduct() {
        System.out.println("*********************************");

        System.out.println("Введите ID продукта");
        int id = consoleIntReader(Integer.MAX_VALUE);

        System.out.println("Введите имя продукта");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введите цену продукта");
        int price = consoleIntReader(Integer.MAX_VALUE);

        shop.addProduct(new Product(id, name, price));

    }

    // удаление товара
    private static void removingAnItem() {
        System.out.println("*********************************");
        System.out.println("Введите ID удаляемого продукта");
        shop.deleteProduct(consoleIntReader(Integer.MAX_VALUE));
    }

    // редактирование товара
    private static void editingAnItem() {
        System.out.println("*********************************");

        System.out.println("Введите ID продукта");
        int id = consoleIntReader(Integer.MAX_VALUE);

        System.out.println("Введите имя продукта");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введите цену продукта");
        int price = consoleIntReader(Integer.MAX_VALUE);

        shop.editProduct(new Product(id, name, price));
    }

    //выход
    private static void exit() {
        alive = false;
    }

    private static void run() {
        while (alive) {
            System.out.println("*********************************");
            System.out.println("Выберите действие:\n" +
                    "     [1] вывод всех товаров;\n" +
                    "     [2] добавление товара;\n" +
                    "     [3] удаление товара;\n" +
                    "     [4] редактирование товара;\n" +
                    "     [5] выход;");

            switch (consoleIntReader(5)) { // consoleIntReader(4) принимает с консоли цифры до 4

                case (1):
                    displayOfAllProducts();
                    break;
                case (2):
                   addingProduct();
                    break;
                case (3):
                    removingAnItem();
                    break;
                case (4):
                    editingAnItem();
                    break;
                case (5):
                    exit();
                    break;
            }
        }
    }

    private static void printList(List<Product> list, boolean revers) {
        System.out.println("*********************************");
        if (!revers) {
            for (Product item : list) {
                System.out.printf("%s    %s    %s", item.getId(), item.getName(), item.getPrice());
                System.out.println();

            }
        } else {
            for (int i = list.size() - 1; i >= 0; i--) {

                System.out.printf("%s    %s    %s", list.get(i).getId(),
                        list.get(i).getName(), list.get(i).getPrice());
                System.out.println();
            }
        }
    }

    private static int consoleIntReader(int maxNumber) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {


            int number = 0;
            boolean happenend = false;
            while (true) {
                try {
                    String str = reader.readLine();
                    number = Integer.parseInt(str);
                    happenend = true;

                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (happenend & (number > 0) & (number <= maxNumber)) {
                    return number;
                } else {
                    System.out.println("Введите ещё раз");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


    public static void main(String[] args) {
        run();
    }
}
