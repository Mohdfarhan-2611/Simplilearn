package OOPs;

public class Employee {
	
	public String Name;
	public int EmpiD;
	private static int salary = 5000; 
	
	public Employee() 
	{
		System.out.println("Inside default Constructer");
	}
	
	
	public Employee(String Name, int EmpiD)
	{
		this.Name = Name;
		this.EmpiD = EmpiD;
	}
	
	
	public void DisplayName()
	{
		System.out.println("Name of the Employee is " +Name);
		
	}
	
	public void DisplayID()
	{
		System.out.println(Name+" Employee ID is "+EmpiD);
	}
	
	public static void DisplaySalary()
	{
		System.out.println("All Employees Salary is "+ salary);
	}

}
