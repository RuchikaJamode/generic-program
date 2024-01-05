package com.bridgelabz.generic;

public class generic_methode {

	
		// TODO Auto-generated method stub
		public static <E> void toPrint (E[] inputArray) { 
			for(E element: inputArray) { 
				System.out.printf("%s", element); 
			} 
			System.out.println();
			}

		

		public static void main(String[] args) {
			Integer[] intArray = { 1, 2, 3, 4, 5}; 
			Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
			Character[] charArray = { 'H', 'E', 'L', 'L', '0' };
			generic_methode.toPrint(intArray); 
			generic_methode.toPrint(doubleArray);

			generic_methode.toPrint(charArray);
	}

}
