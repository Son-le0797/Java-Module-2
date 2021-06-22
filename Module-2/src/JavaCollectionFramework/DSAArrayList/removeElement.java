package JavaCollectionFramework.DSAArrayList;

import java.util.ArrayList;

public class removeElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10);

        arrayList.add(0,"A");
        arrayList.add(1,"B");
        arrayList.add(2,"C");
        arrayList.add(3,"D");

        System.out.println("Array list: "+arrayList);
        arrayList.remove(1);
        System.out.print("array list after remove element: "+arrayList);
    }
}
