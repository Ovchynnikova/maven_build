package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
	
	public static void main(String[] args) {
		
		//// Implementation class of Set
		
		// HashSet --> unordered list
		Set<String> st = new HashSet<String>(); 
		
		// TreeSet --> ascii list
		// Set<String> st = new TreeSet<String>(); 
		
		// LinkedHashSet --> ordered list
		// Set<String> st = new LinkedHashSet<String>(); 
		
		
		//// Methods in Set Interface
		
		////add
		
		st.add("samsung");
		st.add("apple");
		st.add("nokia");
		st.add("pixel");
		
		for (String eachValue : st) {
			System.out.println(eachValue);
		}
		
		
		//// fetch the item
		// we can't because of unordered list --> set
		
		
		//// size()
		System.out.println(st.size());
		
		//// remove the item from the set
		st.remove("apple");
		
		//// Contains()
		
		System.out.println(st.contains("apple"));
		
		//// clear()
		st.clear();
	
		//// isEmpty()
		System.out.println(st.isEmpty());
		
		
		
		
	}

}
