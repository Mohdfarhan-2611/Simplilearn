package Test;

import java.util.Scanner;

public class ConditionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = s.nextInt();
		
		if(age<17) 
		{
		  System.out.println("You are not eligible for Voting");	
		}
		else if(age==17) 
		{
		  System.out.println("You will be eligible for Voting Next year");	
		}
		else
		{
		  System.out.println("You are eligible for voting");
		}
		
		s.close();
	}
}
