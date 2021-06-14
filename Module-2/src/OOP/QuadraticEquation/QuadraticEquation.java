package OOP.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(){

    }
    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminat(){
        return (Math.pow(b,2) - 4*a*c);
    }

    public double getRoot1(){
        return (-b+Math.pow(getDiscriminat(),0.5))/(2*a);
    }

    public double getRoot2(){
        return (-b-Math.pow(getDiscriminat(),0.5))/(2*a);
    }

    public String check(){
        if(getDiscriminat()>0){
           return ("The equation has two roots "+getRoot1()+" and "+getRoot2());
        }
        else if(getDiscriminat()==0){
           return ("The equation has one root "+getRoot1());
        }
        else{
           return ("the equation has no real roots");
        }
    }
}
