import java.io.*;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ypur marks:");
        int i = sc.nextInt();
        if (1 <= 70) {
            System.out.println("your marks is less than 70 then you are Not elegible to placements");
        }
        else{
            System.out.println("Try Next time0");
        }
    }
}
