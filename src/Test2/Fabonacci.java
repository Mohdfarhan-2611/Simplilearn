package Test2;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		int n1=0;
		int n2=1;
		int sum=0;
		
		
		if(num==0 || num<0)
		{
			System.out.println("Invalid number");
		}
		
		if(num==1)
		{
			System.out.println("0");
		}
		
		else if(num==2)
		{   System.out.print("0");
		    System.out.print(" "+"1");
		}   
		else if(num>2) 
		{
		    for (int i=0; i<num; i++)
		    {   
		    	System.out.print(" "+ n1);
		    	sum = n1+n2; 
		    	n1=n2; 
		    	n2=sum; 
		    }
		}
    }
}
