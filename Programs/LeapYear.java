// write a java program that take a year from user and check whether year is leap year or not.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year which you want to check");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("Leap year:"+year);
        }else{
            System.out.println("Year is not Leap year:");
        }
    }
}
