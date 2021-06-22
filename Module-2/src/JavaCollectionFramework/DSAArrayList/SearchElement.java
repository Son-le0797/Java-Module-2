package JavaCollectionFramework.DSAArrayList;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);

        arrayList.add(0,"A");
        arrayList.add(1,"B");
        arrayList.add(2,"C");
        arrayList.add(3,"D");
        arrayList.add(4,"E");
        arrayList.add(5,"F");

        System.out.println("Array list: "+arrayList);
        if(arrayList.contains("H")){
            System.out.print("Found the element.");
        }else {
            System.out.print("There is no such element.");
        }
    }
}
