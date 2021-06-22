package JavaCollectionFramework.DSAArrayList;

import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10);

        arrayList.add(0,"A");
        arrayList.add(1,"B");
        arrayList.add(2,"C");
        arrayList.add(3,"D");

        String element = arrayList.get(1);
        System.out.printf("Element at 1 %d: %s",element);

    }
}
