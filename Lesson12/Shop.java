package Lesson12;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProducts(Product product) {
        if (!isContainById(product)) {
            products.add(product);
        }
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

    public void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
            }
        }
    }

    public void printConsole(){
        for (Product product1 : products){
            System.out.printf("\nid: %d; name: %s; price: %d;", product1.getId(), product1.getName(), product1.getPrice());
        }
    }

    private boolean isContainById(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                return true;
            }
        }
        return false;
    }

    private boolean isContainById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
