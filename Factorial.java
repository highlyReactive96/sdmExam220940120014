

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a Number greater than 0");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
	}

}
