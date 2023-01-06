package codePracticeJava;

public class Alphabets {

	public static void main(String[] args) {


		char ch;

		for( ch = 'a' ; ch <= 'z' ; ch++ ) 

			System.out.println(ch);
		System.out.println("***********************");
		
		oneHundred();
	}


       public static void oneHundred() {

		byte num;

		for(num=1;num<=100;num++) {

			System.out.println(num);
		}
	}

}


