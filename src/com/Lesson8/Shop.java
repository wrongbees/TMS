package com.Lesson8;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.scene.PerspectiveCamera;
import javafx.scene.control.TreeSortMode;

import java.util.*;


public class Shop {

    private List<Product> productList = new ArrayList<Product>();

    public void addProduct(Product product) {

        if (productList.size() != 0) {
            boolean itsPossible = true;
            for (Product item : productList) {

                if (item.getId() == product.getId()) {
                    itsPossible = false;
                    break;
                }
            }
            if (itsPossible) {
                productList.add(product);
            }
        } else {
            productList.add(product);
        }

    }

    public Collection<Product> getAllProduct() {
        List<String> nameList = new ArrayList<>();

//        for (Product item : productList) {
//            nameList.add(item.getName());
//        }

        return productList;
    }

    public void deleteProduct(int id) {

        if (productList.size() == 0) {
            System.out.println("Список товара пуст");
            return;
        }

        int index = 0;
        boolean found = false;

        for (Product item : productList) {

            if (item.getId() == id) {
                found = true;
                break;
            }
            index++;
        }

        if (found) {
            productList.remove(index);
        }
    }

    public void editProduct(Product product) {

        if (productList.size() == 0) {
            addProduct(product);
            return;
        }

        for (Product item : productList) {

            if (item.getId() != product.getId()) {
                item = product;
            }
        }
    }

    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.addProduct(new Product(12, "Водка", 7));
        shop.addProduct(new Product(12, "Водка Аквадив", 8));
        shop.addProduct(new Product(3, "Сало", 10));
        shop.addProduct(new Product(4, "Хлеб", 2));
        shop.addProduct(new Product(44, "Селедка", 5));

         for (Product item : shop.getAllProduct()){
            System.out.printf("%s    %s    %s",item.getId(),item.getName(),item.getPrice());
            System.out.println();

        }
        System.out.println("********************************************");

        PriceComparator prComp = new PriceComparator();

        List<Product> priceList = new ArrayList<>();
        priceList.addAll( shop.getAllProduct());
        Collections.sort(priceList,prComp);

        for (Product item : priceList){
            System.out.printf("%s    %s    %s",item.getId(),item.getName(),item.getPrice());
            System.out.println();
        }
        System.out.println("************************************");
        /*
        удаляем один продукт
         */
        shop.deleteProduct(44);

        for (Product item : shop.getAllProduct()){
            System.out.printf("%s    %s    %s",item.getId(),item.getName(),item.getPrice());
            System.out.println();


    }
}
}
