package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Boolean FINISHED = false;
		int chances = 5;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int theRandomNumber = random.nextInt(100) + 1;
		System.out.println("Pick a number between 1 and 100: ");

		while (FINISHED == false) {

			int userInput = Integer.parseInt(scanner.next());

			if (userInput < 1 || userInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
			} else if (userInput == theRandomNumber) {
				System.out.println("You win!");
				FINISHED = true;
			} else if (chances == 1) {
				FINISHED = true;
				System.out.println("You lose, the number to guess was: " + theRandomNumber);
			} else if (userInput < theRandomNumber) {
				System.out.println("Please pick a higher number:");
				chances--;
			} else {
				System.out.println("Please pick a lower number:");
				chances--;
			}
		}

		scanner.close();
	}
}
