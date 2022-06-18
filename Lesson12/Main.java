package Lesson12;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(12, "Sochni", 2);
        Product product2 = new Product(56, "Dobri", 3);
        Product product3 = new Product(2, "Rich", 4);
        Product product4 = new Product(2, "Rsdasd", 4);

        Shop shop = new Shop();

        shop.addProducts(product1);
        shop.addProducts(product2);
        shop.addProducts(product3);
        shop.addProducts(product4);
        shop.printConsole();
        System.out.println();

        shop.updateProduct(product3);
        shop.printConsole();

        System.out.println();

        shop.deleteProduct(56);
        shop.printConsole();



    }

}
