package Test2;

public class Calculator {
	
	int a = 10;
	int b = 20;
	
	void addition()
	{
		System.out.println(a+b);
	
	}
	
	void subtraction()
	{
		System.out.println(a-b);
	}
	
	void Division()
	{
		System.out.println(a/b);	
	}
	
	void multiplication()
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addition();
		cal.subtraction();
		cal.Division();
		cal.multiplication();
		
	}

}
