package OOP.Shapes;

public class Square extends Shape implements ColorAble{
    private double side = 1.0;

    public Square(){

    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public String display(){
        return "A square has sides: "
                + getSide()
                + ", color: "
                + getColor()
                + ", area: "
                + getArea()
                + " and perimeter: "
                +getPerimeter();
    }

    public void howToColor() {
        System.out.println("color filled");

    }



}
