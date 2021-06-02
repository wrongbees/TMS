package com.Lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleShopStart {

    public static void main(String[] args) {
        //● создаем объект магазина
        Shop shop = new Shop();
        //● создаем пару тройку товаров и добавляем эти товары в магазин
        shop.addProduct(new Product(12, "Водка", 7));
        shop.addProduct(new Product(12, "Водка Аквадив", 8));
        shop.addProduct(new Product(3, "Сало", 10));
        shop.addProduct(new Product(4, "Хлеб", 2));
        shop.addProduct(new Product(44, "Селедка", 5));

        for (Product item : shop.getAllProduct()) {
            System.out.printf("%s    %s    %s", item.getId(), item.getName(), item.getPrice());
            System.out.println();

        }
        System.out.println("********************************************");
        //● получаем список товаров из магазина, сортируем по цене(по возрастанию) и
        //выводим в консоль.
        PriceComparator prComp = new PriceComparator();

        List<Product> priceList = new ArrayList<>();
        priceList.addAll(shop.getAllProduct());
        Collections.sort(priceList, prComp);

        for (Product item : priceList) {
            System.out.printf("%s    %s    %s", item.getId(), item.getName(), item.getPrice());
            System.out.println();
        }
        System.out.println("************************************");
        /*
        ● удаляем один товар
         */
        shop.deleteProduct(44);
        //● получаем список товаров из магазина, сортируем по порядку
        //добавления(последние добавленные в начале) и выводим в консоль.
        List<Product> productList = shop.getAllProduct();

        for (int i = productList.size() - 1; i >= 0; i--) {

            System.out.printf("%s    %s    %s", productList.get(i).getId(),
                    productList.get(i).getName(), productList.get(i).getPrice());
            System.out.println();
        }
        System.out.println("*************************************");

        //● редактируем один товар
        shop.editProduct(new Product(3, "Сало соленое", 15));
        //● получаем список товаров и выводим в консоль
        for (Product item : shop.getAllProduct()) {
            System.out.printf("%s    %s    %s", item.getId(), item.getName(), item.getPrice());
            System.out.println();
        }


    }
}

