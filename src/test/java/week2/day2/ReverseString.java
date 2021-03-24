package week2.day2;

public class ReverseString {
	public static void main(String[] args) {
		
		String txt = "Java Language";
		
		// way 1 
		for (int i = txt.length() - 1; i >= 0; i--) {
			System.out.print(txt.charAt(i));
		}
		
		System.out.println();
		
		// way 2 
		char[] ch = txt.toCharArray();
		for(int i = ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		// way 3
		String[] eachChar = txt.split("");
		for(int i = eachChar.length-1; i>=0; i--) {
			System.out.print(eachChar[i]);
		}
		
		System.out.println();
		
		// way 4
		System.out.println(new StringBuffer(txt).reverse());
		for (int i = 0; i < eachChar.length; i++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
