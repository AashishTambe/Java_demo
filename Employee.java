package Pack16_10_25;

import java.util.Scanner;

public class Employee {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name,city,post;
	int age;
	double basic_salary
	System.out.println("Enter the name of Employee");
	name=sc.next();
	System.out.println("Enter the age of Employee");
	age=sc.nextInt();
	System.out.println("city of Employee");
	city=sc.next();
	System.out.println("Post");
	post=sc.next();
	System.out.println("Basic salary");
	basic_salary=sc.nextInt();
	
	System.out.println("Name= "+name);
	System.out.println("age= "+age);
	System.out.println("city= "+city);
	System.out.println("Post= "+post);
	System.out.println("Basic Salary= "+basic_salary);
	}
}
