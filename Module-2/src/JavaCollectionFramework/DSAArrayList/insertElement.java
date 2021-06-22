package JavaCollectionFramework.DSAArrayList;
import java.util.ArrayList;

public class insertElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10);

        arrayList.add(0,"A");
        arrayList.add(1,"B");
        arrayList.add(2,"C");

        arrayList.add(1,"ABC");     //chèn "ABC" vào index 1 thay cho "B". "B" bị đẩy xuống index 2.
        System.out.print(arrayList);
    }

}
