package day12Package;

public class FinalKeywordDemo {
	
	

		public static void main(String[] args) {
		
			Test t=new Test();
			
			t.x=200; // incorrect, bcoz x is final variable
			
			System.out.println(t.x);

		}


}