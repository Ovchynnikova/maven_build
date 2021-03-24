package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EachCharCount {

	public static void main(String[] args) {
		
		String txt = "Java Language";
		
		// way 1 --> counting single character
		
		int count = 0;
		
//		for (int i = 0; i < txt.length(); i++) {
//			if(txt.charAt(i) == 'a') {
//				count = count + 1;
//			}
//		}
//		
//		 System.out.println("count od a: " + count);
		
		
		// way 2 --> counting single character, using Map
		
//		Map<Character, Integer> mp = new HashMap<Character, Integer>();
//		
//		for (int i = 0; i < txt.length(); i++) {
//			if(txt.charAt(i) == 'a') {
//				count = count + 1;
//				mp.put('a',count);
//			}
//		}
//		
//		System.out.println(mp);
		
		// way 3 --> counting each character 
		
		char[] ch = txt.toCharArray();
		Map<Character, Integer> mp = new TreeMap<Character, Integer>();
		
		for (char c : ch) {
			//System.out.println(c);
			
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
			}else {
				mp.put(c, 1);
			}
			
		    }
		System.out.println(mp);
			
		
		
	}
}
