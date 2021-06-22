package JavaCollectionFramework.DSAArrayList.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>(5);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);

//        int a = listInteger.get(3);

        for(int i = 0; i< listInteger.size();i++) {
            listInteger.get(i);
        }
        int b = listInteger.remove(3);

//        System.out.println("element 1: "+listInteger.get(0));
//        System.out.println("element 5: "+listInteger.get(4));
//        System.out.println("element 3: "+listInteger.get(2));

//        System.out.print(b);

//        System.out.print("Size: "+listInteger.size());




    }
}
