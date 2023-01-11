package day11Package;

public class OverridingDemo {
	

		public static void main(String[] args) {

			ICICI ic=new ICICI();
			System.out.println(ic.roi()); //10.5


			AXIS ax=new AXIS();
			System.out.println(ax.roi()); //11.5

			Bank bn=new Bank();
			System.out.println(bn.roi()); //0.0


		}

	}


