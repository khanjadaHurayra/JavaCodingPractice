package pakageDay;

import java.util.Scanner;

public class PrintWeekNames {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter week number(1-7):");
		
		int weekno=sc.nextInt();

		if(weekno==1)
		{
			System.out.println("Monday");
		}
		else if(weekno==2)
		{
			System.out.println("TuesDay");
		}
		else if(weekno==3)
		{
			System.out.println("WednesDay");
		}
		else if(weekno==4)
		{
			System.out.println("ThursDay");
		}
		else if(weekno==5)
		{
			System.out.println("Friday");
		}
		else if(weekno==6)
		{
			System.out.println("Saturday");
		}
		else if(weekno==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid week number.");
		}

	}
}
