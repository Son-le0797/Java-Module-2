package JavaCollectionFramework.DSAArrayList;

import java.util.*;

public class SubList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add(0,"A");
        arrayList.add(1,"B");
        arrayList.add(2,"C");
        arrayList.add(3,"D");
        arrayList.add(4,"E");
        arrayList.add(5,"F");

        System.out.println("Array list: "+arrayList);
        ArrayList<String> subList = (ArrayList<String>) arrayList.subList(0,3);
        System.out.print("Array list after sub: "+subList);
    }
}
