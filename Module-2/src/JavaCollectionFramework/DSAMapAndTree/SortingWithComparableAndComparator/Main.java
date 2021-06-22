package JavaCollectionFramework.DSAMapAndTree.SortingWithComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "Huế");
        Student student1 = new Student("Sơn", 18, "Huế");
        Student student2 = new Student("Phước", 27, "Huế");
        Student student3 = new Student("Đạt", 25, "Huế");
        Student student4 = new Student("Bình", 25, "Huế");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        System.out.println("Comparable");

        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }
        System.out.println("Chỉ sắp xếp theo thứ tự được nhập vào");

        System.out.println("****************************************");

        System.out.println("\nAgeComparator");

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        for(Student st : lists){
            System.out.println(st.toString());
        }
        System.out.println("sắp xếp list theo thuộc tính được chọn để sắp xếp");
    }
}
