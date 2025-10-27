package Pack16_10_25;

import java.util.Scanner;

public class Capital {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name of Country");
	String country=sc.next();
	switch(country) {
	case "India":
		System.out.println("New Delhi");
	break;
	case "USA":
		System.out.println("Washington");
	break;
	case "China":
		System.out.println("Beijing");
	break;
	case "Japan":
		System.out.println("Tokyo");
	break;
	case "Nepal":
		System.out.println("Kathmandu");
	break;
	case "Afghanistan":
		System.out.println("Kabul");
	break;
	case "UK":
		System.out.println("Landon");
	break;
	case "France":
		System.out.println("Paris");
	break;
	case "Germany":
		System.out.println("Berlin");
	break;
	case "Italy":
		System.out.println("Rome");
	break;
	}
	
}
}
