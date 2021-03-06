package JavaCollectionFramework.PracticeArrayListLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product product1 = new Product(1,"Quang", 1000);
        Product product2 = new Product(2,"Tin", 1200);
        Product product3 = new Product(3,"Sơn", 247);
        Product product4 = new Product(4,"Phước", 1200);
        Product product5 = new Product(5,"Đạt", 900);
        Product product6 = new Product(6,"Bình", 700);
        Product product7 = new Product(7,"Nhi", 800);

        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);

        list.remove(product4);
        list.remove(product6);

        System.out.print("Index of value: ");
        System.out.println(list.indexOf(product4));

        for (Product a : list) {
            System.out.println(a);
        }
    }
}
