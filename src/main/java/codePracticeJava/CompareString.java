package codePracticeJava;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		
		String s1, s2;
		int v,v2;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first string"); 
		s1 = in.nextLine();
		 

		System.out.println("Enter the second string");
		s2 = in.nextLine();

		if ( s1.compareTo(s2) > 0 )
		System.out.println("First string is greater than Second.");
		
		else if ( s1.compareTo(s2) < 0 )
		System.out.println("First string is smaller than second.");
		
		else
		System.out.println("Both strings are equal.");
        
		v=s1.compareTo(s2);
		System.out.println(v);
		
		v2=s2.compareTo(s1);
		System.out.println(v2);
		
	}

}
