package com.Lesson8;


import java.util.ArrayList;
import java.util.List;


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

        if(found){ productList.remove(index); }
    }

    public void editProduct(Product product) {
    }
}
