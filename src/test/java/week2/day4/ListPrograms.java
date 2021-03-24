package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class ListPrograms {
	public static void main(String[] args) {
		
List<String> ls = new ArrayList<String>();
		
		ls.add("apple");
		ls.add("samsung");
		ls.add("nokia");
		ls.add("pixel");
		
		for (String eachValue : ls) {
			if (eachValue.startsWith("a")) {
				System.out.println(eachValue);
			}	
		}
		
		
		
	}

}
