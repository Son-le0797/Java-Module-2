package JavaCollectionFramework.DSAMapAndTree.DistinguishHashMapAndHashSet;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(){
    }

    public Student(String name, int age, String address){
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return String.format("Student %s\nage: %d\naddress: %s",name,age,address);
    }
}
