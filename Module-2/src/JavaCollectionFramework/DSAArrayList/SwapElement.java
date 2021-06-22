package JavaCollectionFramework.DSAArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10);

        arrayList.add(0,"F");
        arrayList.add(1,"B");
        arrayList.add(2,"E");
        arrayList.add(3,"A");
        arrayList.add(4,"D");
        arrayList.add(5,"C");

        for(String a : arrayList) {
            System.out.print(a+"\t");
        }
        Collections.swap(arrayList,0,4);
        System.out.println("");
        for(String b : arrayList){
            System.out.print(b+"\t");
        }
    }
}
