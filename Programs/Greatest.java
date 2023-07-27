// Take three number from user and print greatest.
import java.util.*;
public class Greatest {
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("************Find the Greatest one***************");
        System.out.println("Enter the three number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("value of a is greatesr:"+a);
        }else if(b>c&&b>a){
            System.out.println("value of b is greatest:"+b);
        }else{
            System.out.println("Value of c is greatest:"+c);
        }
    }
}

    //    if (a>b) {
    //     if(a>c){
    //         System.out.println("value of a is greatest:"+a);
    //     }else{
    //         System.out.println("value of c is greatest:"+c);
    //     }
    // }
    //     else{
    //         if(b>c){
    //           System.out.println("value of b is greatest:"+b);  
    //         }
    //         else{
    //           System.out.println("value of c is greatest:"+c);
    //         }
    //     }
    //    }
       
    // }
