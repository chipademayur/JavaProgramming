// Write a java program to grade student based on there marks.
import java.util.Scanner;

public class StudentGrade {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Student Marksheet System");
        System.out.println("Enter the marks of student:");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=90&&mark<=100){
            System.out.println("Grade O");
        }else if(mark>=80&&mark<=89){
            System.out.println("Grade A+");
        }else if(mark>=70&&mark<=97){
            System.out.println("Grade A");
        }else if(mark>=35&&mark<=69){
            System.out.println("Pass");
        }else{
            System.out.println("Faill");
        }
    }

    private static void nextInt() {
    }
}
