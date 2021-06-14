package OOP.Shapes;
public abstract class Shape {
    private String color = "red";
    private boolean filled = false;

    public Shape(){

    }

    public Shape(String color, boolean fileed){
        this.color = color;
        this.filled = fileed;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String display(){
        return "A shape with color of: "
                + color
                + " and "
                + (isFilled()?"filled":"not filled" );
    }
}
