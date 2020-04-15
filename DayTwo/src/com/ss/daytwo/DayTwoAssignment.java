package com.ss.daytwo;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DayTwoAssignment {

	public static void main(String[] args) {
		
		//Part one of Assignment adding numbers from the command line
		Integer total = 0;
		Integer value = 0;
		Scanner scanInput = new Scanner(System.in);
		
		System.out.println(" _________________________________");
		System.out.println("| Enter in values to add the sum! |");
		System.out.println("| Type 0 or a non number to exit  |");
		System.out.println("|_________________________________");
		while(true) {
			
			System.out.print("| >");
			
			try {
			value = scanInput.nextInt();
			if(value.equals(0)) {
				break;
			}else {
				total+=value;
			}
			}catch(InputMismatchException e) {
				break;
			}
			
			
		}
		scanInput.close();
		System.out.println("| TOTAL: "+total);
		System.out.println("|_________________________________|");
	
		
		//Part two of assignment 2D array and finding the max number and it's position in the array
		Integer[][] twoDimArray = {{1,4,21,456,23,78,123},{65,2,12,768,3,4545,1}};
		
		Integer compare = twoDimArray[0][0];
		Integer positionOne = 0;
		Integer positionTwo = 0;
		
		for(int i = 0; i < twoDimArray.length; i++) {
			
			for(int j = 0; j < twoDimArray[i].length; j++) {
				
				if(twoDimArray[i][j] > compare) {
					compare = twoDimArray[i][j];
					positionOne = i;
					positionTwo = j;
				}
			}
		}
		
		System.out.println(" _____________________________________");
		System.out.println("| 2D Array looking for the max number |");
		System.out.println("|_____________________________________|\n|");
		System.out.println("| 2D Array = "+Arrays.deepToString(twoDimArray)+"\n|");
		System.out.println("| Max Number: "+ compare +" At position ["+positionOne+"]["+positionTwo+"]");
		System.out.println("|_____________________________________|\n");
		
		
		//Part three of assignment creating the hierarchy
		Rectangle rectangle = new Rectangle(4.0, 4.0);
		Triangle triangle = new Triangle(7.0, 3.0);
		Circle circle = new Circle(2.5);
		
		System.out.println(" ____________________________");
		System.out.println("| Area of Shapes ");
		rectangle.display();
		triangle.display();
		circle.display();
		System.out.println("|____________________________");

	}

}
