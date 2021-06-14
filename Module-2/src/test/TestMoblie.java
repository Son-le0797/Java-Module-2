package test;

public class TestMoblie {
    private String message;

    public TestMoblie(String message){
        this.message = message;
    }


    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void display(){
        System.out.println("Mobile message: "+message);
    }
}


