package OOP.Shapes;

public class test {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(6,"red",false) ;
        shapes[1] = new Square(5,"green",true);
        shapes[2] = new Rectangle(7,4,"yellow",false);
        shapes[3] = new Triangle(3,4,5, "purple",true);
        shapes[4] = new Triangle_2(5,7,10);
        for(Shape shape : shapes){
            System.out.println(shape.display());
            System.out.println();
            if(shape instanceof ColorAble){
                ((ColorAble) shape).howToColor();
            }

        }
    }
}
