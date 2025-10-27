package Pack_5;

import java.util.Scanner;

public class Class_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number;
	System.out.println("Enter the Number");
	number=sc.nextInt();
	if(number % 5==0 &&number%7==0) {
		System.out.println("Number is divisible by 5 And 7");
	}
	else if(number % 5==0) {
		System.out.println("Number is divisible by 5");
	}
	else if(number % 7==0) {
		System.out.println("Number is divisible by 7");
	}
	else {
		System.out.println("This Number is Not Divisible by 5 & 7");
	}
}
}
