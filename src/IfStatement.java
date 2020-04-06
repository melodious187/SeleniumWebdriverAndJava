import javax.print.attribute.standard.PresentationDirection;
import java.nio.file.FileSystemNotFoundException;

public class IfStatement {

    public static void main(String[] args) {
        double area;
        double PI  = 3.14159;
        double radius = 30;

        if(radius > 0){
            // code to be executed if condition is true
            area = radius * radius * PI;
            System.out.println("\nThe area for a circle of radius " + radius + " is " + area);
        } else if (radius == 0){
            System.out.println("\nThe area for a circle of radius '0' is '0'");
        }
        else {
            // code to be executed if condition is false
            System.out.println("\nThe Radius entered is a Negative Integer");
        }
    }
}
