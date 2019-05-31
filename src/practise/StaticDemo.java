package practise;

class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static 
	{
		ceo = "Larry";
		System.out.println("In Static");
	}
	
	
	public Emp() 
	{
		eid = 1;
		salary = 3000;
		System.out.println("In constructor");
	}
	
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
	
}

	public class StaticDemo{

	public static void main(String[]args)
	{
		Emp navin = new Emp();
	//	navin.eid = 8;
	//	navin.salary = 4000;
		//navin.ceo = "knight";
		
	
		
		Emp john = new Emp();
		//john.eid = 9;
		//john.salary = 5000;
		//john.ceo = "knight";/// to access a static varaible we dont need object
	
	
		
		navin.show();
		john.show();
	
	}
}
