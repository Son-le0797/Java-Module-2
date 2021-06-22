package OOP.Cylinder;

import OOP.Shapes.Circle;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double getArea(){
        return getPerimeter()*height + 2*super.getArea();
    }

    public double  getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString(){
        return String.format("Radius: %f\nColor: %s\nHeight: %f\nArea: %f\nVolume: %f",getRadius(),getColor(),getHeight(),getArea(),getVolume());
    }

}