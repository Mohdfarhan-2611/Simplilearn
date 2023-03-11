package OOPs;

public class Citizen extends Person {
	
	public int SSN;
	
	public Citizen() {
		System.out.println("Inside default constructor");
	}

	
	public Citizen(String Name, String CountryName, int Age, int SSN)
	{
	  this.Name = Name;
	  this.Age = Age;
	  this.CountryName = CountryName;
	  this.SSN = SSN;
	}


	
}
