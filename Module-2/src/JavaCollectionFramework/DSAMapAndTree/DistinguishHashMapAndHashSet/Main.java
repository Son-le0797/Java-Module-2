package JavaCollectionFramework.DSAMapAndTree.DistinguishHashMapAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sơn",18,"Nguyễn Huệ");
        Student student2 = new Student("PHước",27,"Thất Tịnh Khiết");
        Student student3 = new Student("Đạt",25,"Bà Triệu");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);

        System.out.println("HashMap: \n");
        for(Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("\nCó key để đánh dấu từng đối tượng");
        System.out.println("Sắp xếp theo key\n");

        System.out.println("********************************************");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        System.out.println("\nHashSet: \n");
        for(Student student : students){
            System.out.println(student.toString());
        }
        System.out.print("\nKhông có key để đánh dấu từng đối tượng");
        System.out.print("\nSắp xếp theo giá trị đầu tiên của đối tượng");
    }
}
