package com.Lesson8;


import java.util.*;


public class Shop {

    private List<Product> productList = new ArrayList<>();

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

    public List<String> getAllProduct() {
        List<String> nameList = new ArrayList<>();

        for (Product item : productList) {
            nameList.add(item.getName());
        }

        return nameList;
    }

    public void deleteProduct(int id) {

        if (productList.size() == 0) {
            System.out.println("Список товара пуст");
            return;
        }

        int index = 0;
        boolean found = false;

        for (Product item : productList) {

            if (item.getId() != id) {
                found = true;
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

        System.out.println(shop.getAllProduct().toString());

    }
}
