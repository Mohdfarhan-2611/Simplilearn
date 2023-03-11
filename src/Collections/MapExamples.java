package Collections;

import java.util.HashMap;

public class MapExamples {

	public static void main(String[] args) {
		
		HashMap<String,Integer> basket = new HashMap<String,Integer>();
		
		basket.put("item1", 1);
		basket.put("item2", 5);
		basket.put("item3", 5);
		basket.put("item4", 2);
		
		System.out.println("The map is "+basket);
		
		
		basket.put("item3", 2);
		System.out.println("The map after put is "+basket);
		
		basket.remove("item2");
		System.out.println("The map after remove is "+basket);
		
		basket.put("item5", null);
		System.out.println("The map after null is "+basket);
		
		basket.put(null, 4);
		System.out.println("The map after put is "+basket);
		
		
		
		for(String item:basket.keySet())
		{
			System.out.println("Item name is " +item);
			System.out.println("The quantity is "+basket.get(item));
		}
		
		for(Integer value:basket.values())
		{
			System.out.println("The values are "+value);	
		}
		
		String str = "clean world green world happy world";
		String[] arr1 = str.split(" ");
		HashMap<String,Integer>  duplicate1 = new HashMap<String,Integer>();
		
		for(String word:arr1)
		{
			if(!duplicate1.keySet().contains(word))
			{
				duplicate1.put(word,1);
			}
			else
			{
				duplicate1.put(word, duplicate1.get(word)+1);		
			}
		}    
		       System.out.println("The result is "+duplicate1);
		
		
		


		
		

	}

}
