// Write a java program to convert Inches to Meter
import java.util.Scanner;

public class InchToMeter {
    public static void main(String[]args){
        System.out.println("********************Inches to Meter Conversion*********************");
        System.out.println("Enter the Inches:");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double Meter=a*0.0254;
        System.out.println("Meter conversion is:"+Meter);
    }
}
