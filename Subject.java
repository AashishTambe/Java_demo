package Pack_5;

import java.util.Scanner;

public class B {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int java,Python,C,Web,OS;
	System.out.println("Enter Marks of java");
	java=sc.nextInt();
	System.out.println("Enter Marks of Python");
	Python=sc.nextInt();
	System.out.println("Enter Marks of C");
	C=sc.nextInt();
	System.out.println("Enter Marks of Web");
	Web=sc.nextInt();
	System.out.println("Enter Marks of OS");
	OS=sc.nextInt();
	
	int total=java+Python+C+Web+OS;
	float Per=total/5;
	int grade=total/5;
	
	System.out.println("Total Marks are"+total);
	System.out.println("Percentage is "+Per);
	if (grade>=80) {
		System.out.println("A grade");
	}
	else if(grade>=60 && grade<80) {
		System.out.println("B grade");
	}
	else if(grade>=35 && grade<60) {
		System.out.println("C grade");
	}
	else {
		System.out.println("Fail");
		}
	}
	
}
