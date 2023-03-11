package Test2;

import java.util.Scanner;

public class ReverseNumber {
	
	Scanner s = new Scanner(System.in);
    int number = s.nextInt();
    int Reverse = 0;
	
	
    void Reverse() 
	{   
		while(number!=0) 
		{   int lastDigit = number%10;
			Reverse = Reverse * 10 + lastDigit;
			number = number/10;	
		}
		
		System.out.println(Reverse);		
	}

	
    
    public static void main(String[] args) 
    {
		System.out.println("Enter the number: ");
		ReverseNumber obj = new ReverseNumber();
		obj.Reverse();

	}

}
