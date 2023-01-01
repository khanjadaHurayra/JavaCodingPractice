package codePracticeJava;

import java.util.Scanner;

public class FahrenhitToCelcius {

	public static void main(String[] args) {
		
		
		float temperatue;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter temperatue in Fahrenheit ="); 
		
		temperatue = in.nextInt();

		temperatue = ((temperatue - 32)*5)/9;

		System.out.println("Temperatue in Celsius = " + temperatue);
		}

	}


