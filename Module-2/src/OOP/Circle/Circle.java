package OOP.Circle;

public class Circle {

    private double radius;
    private String color;

    protected Circle(){

    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    public String toString(){
        return String.format("A circle with: \nColor: %s\nRadius: %.1f\nArea: %f",color,radius,getArea());
    }
}
