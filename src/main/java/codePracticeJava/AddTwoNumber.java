package codePracticeJava;

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		number2 = in.nextLine();

		BigInteger first = new BigInteger(number1); 
		
		BigInteger second = new BigInteger(number2); 
		
		BigInteger sum;

		sum = first.add(second);

		System.out.println("Result of addition = " + sum);

	}

}
