package practise;


class Casio{
	int num1;
	int num2;
	String operation;
	
public Casio() 
{
	num1 = 0;
	num2 = 0;
	operation = "Nothing";
		
}
public Casio(int i)
{
		num1 = i;
		num2 = 0;
		operation = "nothing";
		
		
}
public Casio(int i, int t) 
{
	num1 = i;
	num2 = t;
	operation = "nothing";
	
}	
public Casio(int i, int t, String op) 
{
	num1 = i;
	num2 = t;
	operation = op;
	
}	
	
	


	
	//public void add(int b, int k) 
	{
		//System.out.println(b + k);
	}
	
	//public void add(int b, int k, int j) 
	{
	//	System.out.println(b + k + j);
	}
	
	//public void add( double b, double k) 
	{
	//	System.out.println(b + k );
	}
}


	public class MethodOverloadingDemo {

	public static void main(String[] args) 
	{
		Casio obj = new Casio(4, 5, "Add");
		
		
		
		//obj.add(5, 2);
		
		
		//obj .add(4, 8, 6);
		
		//obj .add(4.5, 3.9);
	}
	
	
	
	
}
	
	
	
	



