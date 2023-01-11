package pakageDay;

public class ContinueStatment {

	public static void main(String[] args) {


		for(int i=1;i<=10;i++)  //1  2  3  4
		{
			if(i==3 || i==5 || i==7) //false   false  true
			{
				continue;
			}

			System.out.println(i);  //1   2  4 5
		}


	}

}
//Question about it.