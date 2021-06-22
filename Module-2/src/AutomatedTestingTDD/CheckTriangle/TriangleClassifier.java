package AutomatedTestingTDD.CheckTriangle;

public class TriangleClassifier {



    public static String checkTriangle(int a, int b, int c){
        String check;
        if((a + b) > c && (a + c) > b && (b + c) > a){
            if(a == b && a == c && b == c){
                check = "Tam giác đều";
            }
            else if(a == b || b == c || a == c){
                check = "Tam giác cân";
            }
            else
                check = "Tam giác thường";
        }
        else
            check = "Không phải tam giác";
        return check;

    }
}
