package codePracticeJava;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		
		int x, y, temp; 
		
		System.out.print("Enter x  = "); 
		
		Scanner in = new Scanner(System.in);

		x = in.nextInt(); 
		
		System.out.print("Enter y = "); 
		y = in.nextInt();
		System.out.println("Before Swapping\nx = "+x+"\ny = "+y); 
		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping\nx = "+x+"\ny = "+y);
		 

	}

}
