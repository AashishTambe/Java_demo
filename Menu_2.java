package Pack16_10_25;
import java.util.Scanner;

public class menu_program_2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("-------Menu---------");
	        System.out.println("1. Area of Circle");
	        System.out.println("2. Area of Rectangle");
	        System.out.println("3. Area of Square");
	        System.out.println("4. Circumference of Circle");
	        System.out.println("5. Square of a Number");
	        System.out.println("6. Cube of a Number");

	        System.out.print("Enter your choice");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter radius of the circle: ");
	                double radius = sc.nextDouble();
	                double areaCircle = Math.PI * radius * radius;
	                System.out.println("Area of Circle: " + areaCircle);
	                break;
	            case 2:
	                System.out.print("Enter length of the rectangle: ");
	                double length = sc.nextDouble();
	                System.out.print("Enter width of the rectangle: ");
	                double width = sc.nextDouble();
	                double areaRectangle = length * width;
	                System.out.println("Area of Rectangle: " + areaRectangle);
	                break;
	            case 3:
	                System.out.print("Enter side of the square: ");
	                double side = sc.nextDouble();
	                double areaSquare = side * side;
	                System.out.println("Area of Square: " + areaSquare);
	                break;
	            case 4:
	                System.out.print("Enter radius of the circle: ");
	                double r = sc.nextDouble();
	                double circumference = 2 * Math.PI * r;
	                System.out.println("Circumference of Circle: " + circumference);
	                break;
	            case 5:
	                System.out.print("Enter a number: ");
	                double num = sc.nextDouble();
	                System.out.println("Square of the number: " + (num * num));
	                break;
	            case 6:
	                System.out.print("Enter a number: ");
	                double numCube = sc.nextDouble();
	                System.out.println("Cube of the number: " + (numCube * numCube * numCube));
	                break;
	            default:
	                System.out.println("Invalid choice");
				break;
	     
	    }
	}
}
