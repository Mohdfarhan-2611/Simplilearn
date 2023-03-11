package Test;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20,30,40, 50};
		
		System.out.println("The lengthe of array is "+ arr.length);
		System.out.println("The first element inside the array is "+ arr[0]);
		System.out.println("The last element inside the array is "+ arr[arr.length-1]);

		
		String[] arr2 = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		System.out.println("The length of string is "+arr2.length);
		
		
		
		String str = "Clean World Green World Happy world";
		String[] arr3 = str.split(" ");
		System.out.println("The length of string is "+arr3.length);
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//for each loop
		for(int val: arr) {
			System.out.println(val);
		}
		
		
		
	}

}
