package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
		
		// Generic --> <String>, <Integer>, <Character>
		// and you also need to mention this on both sides
		// and use the whole word , not int, char
		
		
		List<String> ls = new ArrayList<String>();
		
		// Methods in List Interface
		
		//// 1.add(value) --> adding single item in the list
		
		ls.add("samsung");
		ls.add("apple");
		ls.add("nokia");
		ls.add("pixel");
		
		//// 2.size() --> return the count of list
		
		System.out.println(ls.size());
		
		//// 3.get(index) --> return the value based on the given index number
		
		System.out.println(ls.get(0));
		
		//// 4.contains() --> returns either true or false
		
		System.out.println(ls.contains("apple"));
		
		
		for (String eachValue : ls) {
			System.out.println(eachValue);
		}
		
		//// 5.remove() --> delete the item
		//ls.remove("apple");
		//System.out.println(ls);
		
		//// 6. clear() --> clears all list
		
		//ls.clear();
		
		//// 7.isEmpty() --> returns either true or false
		//System.out.println(ls.isEmpty());
		
		
		
		//// to sort the list use Collections class
		
		Collections.sort(ls);
		for (String eachValue : ls) {
			System.out.println(eachValue);
		}
		
		//// to shuffle 
		Collections.shuffle(ls);
		for (String eachValue : ls) {
			System.out.println(eachValue);
		}
		
		//// to reverse
		
		Collections.reverse(ls);
		for (String eachValue : ls) {
			System.out.println(eachValue);
		}
	
		
		
	}
	

}
