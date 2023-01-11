package day12Package;

import day11Package.Child1;
import day11Package.Child2;

public class InheritanceDemo implements Shape{
	
	public class HeirarchyInheritanceDemo {

		public static void main(String[] args) {
		
			Child1 c1=new Child1();
			c1.display(100);
			c1.show(200);
			
			Child2 c2=new Child2();
			c2.display(10);
			c2.print(20);
					
			
			

		}

	}

}
