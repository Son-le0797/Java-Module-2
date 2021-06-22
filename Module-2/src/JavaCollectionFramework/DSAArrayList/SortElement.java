package JavaCollectionFramework.DSAArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10);

        arrayList.add(0,"F");
        arrayList.add(1,"B");
        arrayList.add(2,"E");
        arrayList.add(3,"A");
        arrayList.add(4,"D");
        arrayList.add(5,"C");

        System.out.println("Array list: "+arrayList);
        Collections.sort(arrayList);
        System.out.print("Array list after sort: "+arrayList);
    }
}
