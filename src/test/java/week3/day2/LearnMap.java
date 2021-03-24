package week3.day2;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {
	
	public static void main(String[] args) {
		
		// each key with value is Entry
		// collection of keys with values are EntrySet
		
		
		//// Implementation class of Map
		
		// HashMap --> random
		//TreeMap --> ascii 
		//LinkedHashMap --> maintains the order
		
		Map<Integer, String> mp = new HashMap<Integer,String>();
		
		//// Methods in Map Interface
		
		// put
		mp.put(001, "name1");
		mp.put(002, "name2");
		mp.put(003, "name3");
		mp.put(004, "name4");
		mp.put(005, "name5");
		
		// size
		System.out.println(mp.size());
		
		// get(key)
		System.out.println(mp.get(001));
		
		// remove(key)
		System.out.println(mp.remove(3));
		
		// containsKey(key), containValue(value)
		System.out.println(mp.containsKey(002));
		System.out.println(mp.containsValue("name5"));
		
		// clear
		mp.clear();
		
		// isEmpty()
		System.out.println(mp.isEmpty());
		
		
		//// loop 
		// for(DataType variable : collection){}
			
		for(Entry<Integer, String> eachEntry : mp.entrySet()) {
			System.out.println(eachEntry.getKey()+ "------>" + eachEntry.getValue());	
		}
		
		
		
		
		
		
		
	}

}
