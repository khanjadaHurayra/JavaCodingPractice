package pakageDay;

public class WhileLoopDemo {

public static void main(String[] args) {
		
		//Example 1:  1....10 numbers
		
		/*int i=1;   // initilization
		
		while(i<=10) //condition
		{
			System.out.println(i); 
			i++; //incrementation
		}
		*/
		
		
		//Example2: print hello 10 times
		
		/*int i=1;
		
		while(i<=10)
		{
			System.out.println("Hello..");
			i++;
		}*/
		
		
		//Example3: print even numbers between 1...10
		
		//method1
		/*int i=2;
		
		while(i<=10)
		{
			System.out.println(i);
			i+=2;     //i=i+2;
		}*/
		
		
		//method2
		/*int i=1;
		
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}*/
		
		
		//Example4: 10 9 8......1
		
		/*int i=10;
		
		while(i>0)   //10 9
		{
			System.out.println(i); //10 9.....1
			i--;  //9  8
		}*/

		int i=1;
		while(i<=10)     // infinite loop bcoz condition ais always true.
		{
			System.out.println(i);
		}
	
	}
}
