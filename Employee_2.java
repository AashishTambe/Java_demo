package Pack16_10_25;

import java.util.Scanner;

public class Employee_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,city,post;
		int age;
		double basic_salary,da,hra,tra,pt,pf,gross_salary,net_salary;
		System.out.println("Enter the name of Employee");
		name=sc.next();
		System.out.println("Enter the age of Employee");
		age=sc.nextInt();
		System.out.println("city of Employee");
		city=sc.next();
		System.out.println("Post");
		post=sc.next();
		System.out.println("Basic salary");
		basic_salary=sc.nextDouble();
		
	    da= (basic_salary *10)/100;
	    hra= (basic_salary *15)/100;
	    tra= (basic_salary *5/100);
	    pt= (basic_salary *10/100);
	    pf= (basic_salary *12/100);
	    gross_salary=basic_salary+da+hra+tra;
	    net_salary=gross_salary- (pt+pf);
	    
	    System.out.println("-------------------------------------");
	    System.out.println("Employee Details");
	    System.out.println("Name= "+name);
		System.out.println("age= "+age);
		System.out.println("city= "+city);
		System.out.println("Post= "+post);
		System.out.println("Basic Salary= "+basic_salary);
		System.out.println("Gross Salary= "+gross_salary);
		System.out.println("Net Salary= "+net_salary);    
}
}
