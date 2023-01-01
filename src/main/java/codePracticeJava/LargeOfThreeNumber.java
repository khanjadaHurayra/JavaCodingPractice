package codePracticeJava;

import java.util.Scanner;

public class LargeOfThreeNumber {

	public static void main(String[] args) {
		
		
		int x, y, z;
		System.out.println("Enter three integers here one after one ~~~~ ");
		
		Scanner in = new Scanner(System.in);

		x = in.nextInt(); y = in.nextInt(); z = in.nextInt();

		if ( x > y && x > z ) 
		System.out.println("First number is largest.");
		
		else if ( y > x && y > z ) 
		System.out.println("Second number is largest.");
		
		else if ( z > x && z > y )
		System.out.println("Third number is largest.");
		
		else
		System.out.println("Entered numbers are not distinct.");

	}

}
