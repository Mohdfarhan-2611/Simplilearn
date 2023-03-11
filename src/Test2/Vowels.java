package Test2;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = s.next();
		
		int vowel =0;
		
		
		for (int i =0; i<s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(c=='a' || c=='e'|| c=='i' || c=='o' ||c=='u')
			{
			  vowel++;  
			}
			 
	    }
		    System.out.println(vowel);
		    

		
	}

}
