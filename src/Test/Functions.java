package Test;

import java.util.function.Function;

public class Functions {
	
	
	
	 static int Addition(int a, int b) {
	    return a+b;
	}
	 static int subtraction(int c, int d) {
		 return c-d;
	 }
	 
	 static int Multiplication(int e, int f) {
		 return e*f;
	 }
	 
	  static int Division(int g, int i) {
		 return g/i;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = Addition(10, 20);
		System.out.println(sum);
		int mul = Multiplication(20, 30);
		System.out.println(mul);
		int div = Division(30, 40);
		System.out.println(div);
		int sub = subtraction(20, 20);
		System.out.println(sub);
		 
		
		

	}

}
