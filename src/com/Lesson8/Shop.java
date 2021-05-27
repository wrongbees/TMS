package com.Lesson8;


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

    public List<Product> getAllProduct() {
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

        for (int i = 0; i < productList.size(); i++) {

            if (productList.get(i).getId() == product.getId()) {
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
            }
        }
    }


}

