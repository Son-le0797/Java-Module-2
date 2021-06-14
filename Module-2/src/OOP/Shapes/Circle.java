package OOP.Shapes;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return Math.PI*2*radius;
    }

    public String display(){
        return "A circle with radius: "
                + getRadius()
                + " and area: "
                + getArea()
                + " and perimeter: "
                + getPerimeter();
    }
}
