package week2.day2;

public class LearnString {
	
	public static void main(String[] args) {
		
		// we can declare the string in two ways:
		// 1. by string literal
		////String name1 = "the sentence";
		
		// 2.by string object
		////String name2 = new String("the sentence");
		//System.out.println(name1);
		//System.out.println(name2);
		
		// diff btw them very big -> related to the memory
		
		// string literal
		String name = "Welcome to test automation world";
		
		//// Count of the string
		int count = name.length();
		System.out.println(count);
		
		
		
		//// Converts String to Array 
		char[] ch = name.toCharArray();
		//for (char c : ch) {
		//System.out.println(c);
		//}
		System.out.println(ch[3]);
		
		//// charAt
		System.out.println(name.charAt(3));
		
		//// indexOf
		System.out.println(name.indexOf('W'));
		
		//// lastIndexOf 
		// to get the index of the last t in the sentence 
		System.out.println(name.lastIndexOf('t'));
		
		//// split
		String[] str = name.split(" ");
		System.out.println(str[0]);
		System.out.println(str.length);
		
		//// startsWith
		System.out.println(name.startsWith("W"));
		
		////endWith
		System.out.println(name.endsWith("d"));
		
		//// contains
		System.out.println(name.contains("test"));
		
		//// replace
		System.out.println(name.replace('W', 'w'));
		
		//// substring
		System.out.println(name.substring(8));
		
		System.out.println(name.subSequence(8, 16));
		
		
		
	}}
