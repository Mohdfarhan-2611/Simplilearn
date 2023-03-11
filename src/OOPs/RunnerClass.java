package OOPs;

public class RunnerClass {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.Name = "Nikunj";
		emp1.EmpiD = 1000;
		emp1.DisplayName();
		emp1.DisplayID();
		
		
		
		Employee emp3 = new Employee("Farhan", 1001);
		emp3.DisplayName();
		emp3.DisplayID();
		
		
		Employee.DisplaySalary();
		//Employee.salary = 6000;
		Employee.DisplaySalary();
				
        
		Citizen ct1 = new Citizen();
		
		ct1.Name = "Farhan";
		ct1.Age = 30;
		ct1.SSN = 12345;
		ct1.CountryName = "India";
				
		Citizen ct2 = new Citizen("Farhan","India",30,12345);
		
		Insurance in1 = new Insurance();
		
		in1.Insurance = 300;
		in1.SSN= 1234;
		in1.Age= 20;
		in1.CountryName = "India";
		in1.Name = "Tayab";
		
		
		
		EncapsulationExample exp = new EncapsulationExample();
		exp.setEmpid(1000);
		System.out.println(exp.getEmpid());
	
		


	}

}
