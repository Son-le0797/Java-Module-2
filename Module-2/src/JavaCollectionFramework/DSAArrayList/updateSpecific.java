package JavaCollectionFramework.DSAArrayList;

import java.util.ArrayList;

public class updateSpecific {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10);

        arrayList.add(0,"A");
        arrayList.add(1,"B");
        arrayList.add(2,"C");
        arrayList.add(3,"D");

        System.out.println(arrayList);
        arrayList.set(2,"CBA");
        System.out.print(arrayList);
    }
}
