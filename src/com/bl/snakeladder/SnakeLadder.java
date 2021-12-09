package com.bl.snakeladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Starting of Snake and Ladder Game");

		// int noPlay = 0;
		int ladder = 1;
		int snake = 2;
		int urPresentStep = 0;

		System.out.println("Starting the Game and You Are On step :" + urPresentStep);
		while (urPresentStep < 100) {
			int dice = (int) Math.floor(Math.random() * 6 + 1);
			System.out.println("The number on dice is : " + dice);
			int option = (int) Math.floor(Math.random() * 3);
			System.out.println("If you get option as 0 it is noplay, 1 it is ladder, 2 it is snake ");
			System.out.println("You got option :" + option);
			if (option == ladder) {
				urPresentStep += dice;
				if (urPresentStep > 100)
					urPresentStep = option;
				System.out.println("You are on step move forward:" + urPresentStep);
			} else if (option == snake) {
				urPresentStep -= dice;
				if (urPresentStep < 0)
					urPresentStep = 0;
				System.out.println("You are on step move backward : " + urPresentStep);

			} else {
				System.out.println("You are on step :" + urPresentStep);
			}
		}
	}
}