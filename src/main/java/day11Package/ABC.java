package day11Package;

public class ABC {
	
	
		void m1(int a)
		{
			System.out.println(a);
		}
		
		void m2(int b)
		{
			System.out.println(b);
		}
	}


	class XYZ extends ABC
	{
		void m1(int a)   // overrided method
		{
			System.out.println(a*a);
		}
		
		void m2(int a, int b)  // overloaded method
		{
			System.out.println(a+b);
		}
		
	}



	


