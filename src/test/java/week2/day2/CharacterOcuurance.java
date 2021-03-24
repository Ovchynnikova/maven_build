package week2.day2;

public class CharacterOcuurance {
	
	
	public static void main(String[] args) {
		
		String name = "count of characters";
		
		//// way 1:
			// Split
		int count1 = 0;
		String[] character = name.split("");
		for (String eachChar : character) {
			// " " because we have String []
			// we can't use == for comparison of the strings
			// only the function equals()
			if (eachChar.equals("c")) {
				count1 = count1 + 1;
			}
		}
		System.out.println("count of given character is :" + count1);
		////
		
		
		
		
		//// way 2:
			// replace
		//int totalCount = name.length();
		//int charCount = name.replace("c", "").length();
		//System.out.println(charCount);
		//System.out.println(totalCount);
		//System.out.println(totalCount - charCount);
		//
		// or
		//
		System.out.println("count of given character is :" + (name.length() - name.replace("c", "").length()));
		////
		
		
		
		
		//// way 3:
			// charAt()
		
		// System.out.println(name.charAt(0));
		int count3 = 0;
		for (int i = 0; i < name.length(); i++) {
			 if (name.charAt(i) == 'c') {
				 count3 = count3 + 1;
			 }
		 }
		 System.out.println("count of given character is :" + count3);
		////
		
		 
		 
		
		///// way 4:
			// toCharArray()
		int count4 = 0;
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'c') {
				//System.out.println(ch[i]);
				count4 = count4 + 1;
			}
		}
		
		System.out.println("count of given character is :" + count4);
		////
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
