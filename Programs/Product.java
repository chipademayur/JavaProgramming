// Write a java program that takes two numbers as input and display the product of two numbers.

import java.util.Scanner;

/**
 * Product
 */
public class Product {

    public static void main(String[] args) {
         System.out.println("enter two number");
         Scanner sc=new Scanner(System.in);
         int c=sc.nextInt();
         int a=sc.nextInt();
         int d=c*c;
         int b=a*a;
         
         System.out.println("you enter first number squre is:"+b+"and second number squre is"+d);

    }
}