//Alfredo Martinez

package com.ss.dayone;

import java.util.*;

public class DayOneRandomNumbers {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner userInput = new Scanner(System.in);
		
		int chances = 5;
		int min, max;
		int hiddenNumber = rand.nextInt(100);
		hiddenNumber += 1;
		min = hiddenNumber - 10;
		max = hiddenNumber + 10;
		
		System.out.println(hiddenNumber); //use to see number being thrown
		
		System.out.println(" _____________________________________________ ");
		System.out.println("| COME AND GUESS A NUMBER AND WIN A PRIZE!!!! |");
		System.out.println("|________PICK A NUMBER FROM 1 - 100 __________|");
		System.out.println("|_____________________________________________|");
		
		//Loop to check if number is 10 numbers up or down the random number
		while(true) {
			
		System.out.print("| YOUR GUESS IS: ");
		int guess = userInput.nextInt();
		System.out.println("|                                             |");
		
		if(guess >= min && guess <= max && guess != hiddenNumber) {
			int howClose = hiddenNumber-guess;
			if(howClose < 0)
				howClose*=-1;
			System.out.println(" ___________________________________________ ");
			System.out.println("| WOW YOU WERE CLOSE YOU WIN A PRIZE IT'S...|");
			System.out.println("| NOTHING GO HOME...........................|");
			System.out.println("| THE NUMBER WAS ["+hiddenNumber+"]");
			System.out.println("| YOU WERE "+howClose+" NUMBERS OFF");
			System.out.println("|___________________________________________|");
			break;
		}
		else if(guess == hiddenNumber) {
			
			System.out.println("|$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|");
			System.out.println("| WOW YOU GOT IT RIGHT ON THE DOT GOOD JOB!!! |");
			System.out.println("| THE NUMBER WAS ["+hiddenNumber+"]");
			System.out.println("|$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|");
			break;
			
		}
		
		chances--;
		if(chances == 0) {
			System.out.println("| LOOKS LIKE YOUR OUT OF CHANCES              |");
			System.out.println("| THE NUMBER WAS ["+hiddenNumber+"]");
			System.out.println("| RERUN THE APPLICATION AND TRY AGAIN!        |");
			System.out.println("|_____________________________________________|");
			break;
		}
		System.out.println("| SORRY YOUR NOT EVEN CLOSE TRY AGAIN         |");
		System.out.println("| Chances Left = "+chances+"                            |");
		System.out.println("|                                             |");
		
		
		}
		

	}

}
