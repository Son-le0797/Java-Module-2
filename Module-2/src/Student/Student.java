package Student;

public class Student {
    String name,classes;

    Student(){

    }
    protected void setName(String name){
        this.name = name;
    }
    protected void setClasses(String classes){
        this.classes = classes;
    }
    public String getName(){
        return name;
    }
    public String getClasses(){
        return classes;
    }
}
