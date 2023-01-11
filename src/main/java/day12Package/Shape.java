package day12Package;

public class Shape {


	int lenght=10;   // final & static
	int width=20;    // final & static

	void circle();   // abstract method- un-implemented

	default void sqaure()   // default method
	{
		System.out.println("this is sqaure- defualt method");
	}

	static void rectangle()   // static method
	{
		System.out.println("this is rectangle");
	}

}





