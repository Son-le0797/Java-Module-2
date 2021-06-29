package JavaCollectionFramework.PracticeArrayListLinkedList;

import java.util.ArrayList;
import java.util.List;


public class productManagent {
    int size = 0;

    Product product = new Product();
    List<Product> productList = new ArrayList<>();



    public void add(Product product) {
        productList.set(size, product);
    }

    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(i == productList.get(i).getId()) {

            }
        }
    }

}
