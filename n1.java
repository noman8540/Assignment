package neww;

import java.util.ArrayList;

public class n1 {

	public static void main(String args[])
	{
		ArrayList<String> food = new ArrayList<>();
		
		food.add("Apple");
		food.add("banana");
		food.add("Grapes");
		food.add("mango");
		
		System.out.println("Food are:" +food);
		
		food.remove("banana");
		
		System.out.println("After Remove: " + food);
		
		String firstElement = food.get(0);
		
		System.out.println("1st element is: "+ firstElement);
		
		
		String lastElement = food.get(food.size() - 1);
		
		System.out.println("Last Element is: "+ lastElement);
		
		
		
		String checkElement = "Grapes";
		
		System.out.println("Element Exist: " + checkElement);
		
		
		boolean isEmpty = food.isEmpty();
		System.out.println("Is Empty or not: "+ isEmpty);		
	}
}
