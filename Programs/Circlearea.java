// write a java program to calculate area and perimeter of circle.
import java.util.*;
public class Circlearea {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("---------------------------------*calculate Area of circle*---------------------------------");
        System.out.println("Enter the value of radius:");
        Scanner sc= new Scanner(System.in);
        double r=sc.nextDouble();
        
        double a=3.14;

        Double Area=a*r*r;
        Double perimeter=2*a*r;

        System.out.println("Area of circle is:"+Area);
        System.out.println("Perimiter of circle is:"+perimeter);
    

    }
}
