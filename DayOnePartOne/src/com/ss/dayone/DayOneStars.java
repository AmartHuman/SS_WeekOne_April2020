//Alfredo Martinez

package com.ss.dayone;

public class DayOneStars {
	
	
	public static int dotBuilder(int counter) {
		int num = 8 + counter;
		
		for(int x = 0; x < num; x++) {
			System.out.print("-");
		}
		System.out.println();
		
		counter++;
		return counter;
		
	}

	public static void main(String[] args) {
		
		int counter = 1;
		
		//Loop for Pattern 1
		System.out.println(counter+")");
		
		for(int x = 0; x < 5; x++) {
			
			for(int y = 0; y < x; y++) 
				System.out.print("*");
			
			System.out.println("");
			
		}
		counter = dotBuilder(counter);
		
		
		//Loop for Pattern 2
		System.out.println("\n"+counter+")");
		
		counter = dotBuilder(counter);
		
		for(int x = 4; x > 0; x--) {
			
			for(int y = 0; y < x; y++)
				System.out.print("*");
			System.out.println();
		}
		
		//Loop for Pattern 3
		System.out.println("\n"+counter+")");
		for(int x =  0; x <= 4; x++) {
			
			for(int y = x; y < 6; y++)
				System.out.print(" ");
			
			for(int z = 1; z <=(2*x-1); z++)
				System.out.print("*");
			
			System.out.println();
		}
		
		counter = dotBuilder(counter);
		
		
		//Loop for Pattern 4
		System.out.println("\n"+counter+")");
		
		counter = dotBuilder(counter);
		
		for(int x = 4; x > 0; x--) {
			
			for(int y = x; y < 6; y++)
				System.out.print(" ");
			
			for(int z = 1; z <=(2*x-1); z++)
				System.out.print("*");
			
			System.out.println();
		}


	}

}
