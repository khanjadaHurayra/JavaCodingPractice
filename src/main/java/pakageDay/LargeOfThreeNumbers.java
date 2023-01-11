package pakageDay;

public class LargeOfThreeNumbers {
	
	public static void main(String[] args) 
	{
		
		int a=200, b=300, c=100;
		
		if( (a>b) && (a>c) )
		{
			System.out.println("a is largest number");
		}
		else if( (b>a) && (b>c))
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}
		
	}


}
