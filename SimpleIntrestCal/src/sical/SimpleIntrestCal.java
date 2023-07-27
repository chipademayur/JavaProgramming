package sical;

import java.util.Scanner;

public class SimpleIntrestCal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principle:");
		int p=sc.nextInt();
		System.out.println("Enter the rate of SI:");
		int r=sc.nextInt();
		System.out.println("Enter the time period in year:");
		int t=sc.nextInt();
		int SI=(p*r*t)/100;
		System.out.println("Simple intrest of amount is"+SI);

	}

}
