package Test;

public class LoopingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print 1 to 10 using while loop

		int num = 10;
		int num1 = 10;

		int i = ++num;
		int j = num1++;
		System.out.println(i);
		System.out.println(j);

		// print 10 to 1 using while loop

		while (num >= 1) {

			if (num == 5) {
				System.out.println("skip");
				num--;
				continue;
			}
			System.out.println(num);
			num--;
		}
		System.out.println("End of while loop");

		System.out.println("===================");

		String name = "John is from US";

		for (i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		System.out.println("=========Reverse a String=========");
		String str = "madam";
		String reverse = "";

		for (int x = str.length() - 1; x >= 0; x--) {
			char lastchar = str.charAt(x);
			reverse = reverse + lastchar;
		}
		System.out.println(reverse);

		if (str.equals(reverse)) {
			System.out.println("its a palindrom");
		} else {
			System.out.println("Not a palindrom");
		}
		System.out.println("=========Reverse a statement=========");
		
		String str1= "David and Lily meets John";
		String reverse1 = "";
		String[] arr2 = str1.split(" ");
		
		for(int y=arr2.length-1; y>=0; y--)
		{
			reverse1= reverse1+arr2[y]+ " ";
		}
		
		System.out.println(reverse1);
	}

}
