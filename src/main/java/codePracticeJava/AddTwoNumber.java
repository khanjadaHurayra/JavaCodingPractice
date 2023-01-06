package codePracticeJava;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		
		int number1,number2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number One Value = ");
		
		
		number1=in.nextInt();
		
		System.out.println("Enter the Number Two Value = ");
		
		number2 =in.nextInt();

		BigInteger first = new BigInteger("number1"); 
		
		BigInteger second = new BigInteger("number2"); 
		
		BigInteger sum = first.add(new BigInteger("second"));

		

		System.out.println("Result of addition = " + sum);

	}

}
