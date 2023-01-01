package codePracticeJava;

import java.util.Scanner;

public class BreakWhileLoop {

	public static void main(String[] args) {
		
		int n;

		Scanner input = new Scanner(System.in);

		while (true) {
		System.out.print("Input an integer  ="); 
		n = input.nextInt();


		if (n == 0) {
		break;
		}
		System.out.println("You entered " + n);
		}

	}

}
