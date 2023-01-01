package codePracticeJava;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		
		
		int passingMarks = 40;
		int marksObtained;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Input marks scored by you  =45"
				+ "");
		
		marksObtained = input.nextInt();
		
		char grade;
		
		if (marksObtained >= passingMarks) {

		if (marksObtained > 90) grade = 'A';
		 

		else if (marksObtained > 75) grade = 'B';
		else if (marksObtained > 60) grade = 'C';
		else
		grade = 'D';

		System.out.println("You passed the exam and your grade is " + grade);
		}
		else 
		{
		grade = 'F';
		System.out.println("You failed and your grade is " + grade);
		}
		
	}
		}


	


