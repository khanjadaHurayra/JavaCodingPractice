package pakageDay;

public class EvenOrOddNumber {

	public static void main(String[] args)
	{
		
		int num=100;
		
		/*if(num%2 == 0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		*/
		
		// by using ternary operator
		
		System.out.println((num%2==0)? "even" : "odd");
		
		
	}
}
