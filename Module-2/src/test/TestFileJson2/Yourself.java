package test.TestFileJson2;

import netscape.javascript.JSObject;

import java.util.ArrayList;

public class Yourself {
    String fullname, address, gender, age;
    ArrayList<String> hobbieList = new ArrayList<>();
    ArrayList<String> learningToolList = new ArrayList<>();
    ArrayList<String> programLanguageList = new ArrayList<>();

    public Yourself() {
    }

    public Yourself(String fullname, String address, String gender, String age) {
        this.fullname = fullname;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ArrayList<String> getHobbieList() {
        return hobbieList;
    }

    public void setHobbieList(ArrayList<String> hobbieList) {
        this.hobbieList = hobbieList;
    }

    public ArrayList<String> getLearningToolList() {
        return learningToolList;
    }

    public void setLearningToolList(ArrayList<String> learningToolList) {
        this.learningToolList = learningToolList;
    }

    public ArrayList<String> getProgramLanguageList() {
        return programLanguageList;
    }

    public void setProgramLanguageList(ArrayList<String> programLanguageList) {
        this.programLanguageList = programLanguageList;
    }

    @Override
    public String toString() {
        return "Yourself{" +
                "fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", hobbieList=" + hobbieList +
                ", learningToolList=" + learningToolList +
                ", programLanguageList=" + programLanguageList +
                '}';
    }

//    public void ConvertJSON (JSONObject obj) {
//        fullname = obj.getString("fullname");
//    }
}
