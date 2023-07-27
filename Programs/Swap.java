// write a java program to swap two number
public class Swap {
    public static void main(String[] args) {
        System.out.println("**************Number swaping***********");
        int Number1=100;
        int Number2=200;
        System.out.println("First number is:"+Number1);
        System.out.println("Second Number is:"+Number2);
        int temp=Number1;
        Number1=Number2;
        Number2=temp;

        
        System.out.println("After swaping First Number is:"+Number1);
        System.out.println("After Swaping Second Number is:"+Number2);
    }
}
