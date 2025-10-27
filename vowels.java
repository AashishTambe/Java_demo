package Pack16_10_25;

import java.util.Scanner;

public class vowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char a;
	System.out.println("Enter the alphabet");
	a=sc.next().charAt(0);
	switch(a) {
	case 'a':
		System.out.println("a is a vowel");
	break;
	case 'e':
		System.out.println("e is a vowel");
	break;
	case 'i':
		System.out.println("i is a vowel");
	break;
	case 'o':
		System.out.println("o is a vowel");
	break;
	case 'u':
		System.out.println("u is a vowel");
	break;
	case 'A':
		System.out.println("A is a vowel");
	break;
	case 'E':
		System.out.println("E is a vowel");
	break;
	case 'I':
		System.out.println("I is a vowel");
	break;
	case 'O':
		System.out.println("O is a vowel");
	break;
	case 'U':
		System.out.println("U is a vowel");
	break;
	default:
		System.out.println("It is not a vowel");
	
	}
}
}
