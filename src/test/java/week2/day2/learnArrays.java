package week2.day2;

import java.util.Arrays;

public class learnArrays {
	public static void main(String[] args) {
		
		//// Arrays
		
		// when creating arrays I need to indicate the size of the array
		int[] values = new int[5];
		// but we don't use it in the real world
		// we use collection instead
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		values[4] = 50;
		
		//// fetch the count of the arrays
		System.out.println("Array size is " + values.length);
		
		//// fetch single item from the array
		System.out.println("Value of index 2 is " + values[2]);
		
		//// fetch the last value of the array
		System.out.println(values[values.length-1]);
		
		//// fetching all values
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		//// use for each loop if you don't know the size of the array
		for (int eachValue : values) {
			System.out.println(eachValue);
		}
		
		String[] mobNames = new String[5];
		mobNames[0] = "XX";
		mobNames[1] = "YY";
		mobNames[2] = "SS";
		mobNames[3] = "ZZ";
		mobNames[4] = "AA";
		
		//// fetch item the last before
		System.out.println(mobNames[mobNames.length-2]);
		
		//// to sort the array ASC
		
		Arrays.sort(mobNames);
		for (String eachMob : mobNames) {
			System.out.println(eachMob);
		}
		
		//// to store in the collection int and String
		Object[] data = new Object[3];
		data[0] = "String";
		data[1] = 10;
		data[2] = 10.10;
		
		//System.out.println(data[1] + 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
