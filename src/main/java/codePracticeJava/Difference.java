package codePracticeJava;

public class Difference {

	public static void main(String[] args) {


		Difference t = new Difference(); 
		t.show(); //calling using object

		display(); //calling without object

	}

	static void display() { 

		System.out.println("Programming is amazing.");
	}

	void show(){
		System.out.println("Java is awesome.");

	}

}
