package JavaCollectionFramework.DSAArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10);

        arrayList.add(0,"A");
        arrayList.add(1,"B");
        arrayList.add(2,"C");
        arrayList.add(3,"D");
        arrayList.add(4,"E");
        arrayList.add(5,"F");

        System.out.println("Array list: "+arrayList);
        Collections.reverse(arrayList);
        System.out.print("Array list after reverse: "+arrayList);
    }
}
