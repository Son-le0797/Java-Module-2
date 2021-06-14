package OOP.Shapes;

public class Rectangle extends Shape {
    private double width =1.0,height=1.0;

    public Rectangle(){

    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }

    public String display(){
        return "A Rectangle has width: "
                + getWidth()
                + " and height: "
                + getHeight()
                + ", area: "
                + getArea()
                + ", perimeter: "
                + getPerimeter();
    }
}
