package abhi;

import com.practice.One.Emp;

public class Last {
	
	class Emp
	{
		int eid;
		int salary;
		static String ceo;
		static String ceo2;
		
		static
		{
			ceo="Harshit";
			System.out.println("this is static");
		}
		
		public Emp()
		{
			eid=2;
			salary=8000;
			System.out.println("this is constructor");
		}
		
		static
		{
			ceo2="Bhuvan";
			System.out.println("this is static2");
		}
		public void show()
		{
			System.out.println(eid + " : " + salary + " : " + ceo + " : " + ceo2);
		}
	}

	public class StaticDemo {

		public static void main(String[] args)
		{
		Emp kartik = new Emp();

	    Emp harish = new Emp();
	 
		
	    kartik.show();
	    harish.show();
	    
		}
		
	}


}
