package Collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		String[] names = {"Farhan", "Tayyab", "Asir", "Zainul"};
		System.out.println("The second name is "+ names[1]);
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Farhan");
		list1.add("Tayyab");
		list1.add("Asir");
		list1.add("Zainul");
		
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		System.out.println(list1.get((list1.size())-1));
		
		//adding an element in between the list
		list1.add(1, "Shahnawaz");
		System.out.println(list1);
		
		//replacing an element in the list
		list1.set(1, "Atiq");
		System.out.println(list1);
		
		
		//remove an element in the list
		list1.remove(2);
		System.out.println(list1);
		
		
		

	}

}
