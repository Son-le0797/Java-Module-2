package JavaCollectionFramework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesByHashMap {
    public static void countFrequencies(ArrayList<String> list) {
        Map<String,Integer> map = new HashMap<String, Integer>() ;

        for (String i : list) {
            Integer j = map.get(i);
            map.put(i,(j == null) ? 1 : j + 1);
        }
        for (Map.Entry<String,Integer> val : map.entrySet()) {
            System.out.println("Element " + val.getKey() +
                                "occurs " +
                                val.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        list.add("");
        list.add("");
        countFrequencies(list);
    }
}
