package com.bl.snakeladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Starting of Snake and Ladder Game");
		
		int noPlay = 0;
		int ladder = 1;
		int snake = 2;
		int urPresentStep = 0;
		
		while (urPresentStep < 100) {
			int dice = (int) Math.floor(Math.random() * 6 + 1);
			System.out.println("The number on dice is " + dice);
			int option = (int) Math.floor(Math.random() * 4);
			System.out.println("If you get 0 it is noPlay,1 it is ladder,2 it is snake ");
			System.out.println("You got " + option);
			if (option == ladder) {
				urPresentStep += dice;
				if (urPresentStep > 100)
					urPresentStep -= dice;
				System.out.println("You are on :" + urPresentStep);
			} else if (option == snake) {
				urPresentStep -= dice;
				if (urPresentStep < 0)
					urPresentStep = 0;
				System.out.println("You are on : " + urPresentStep);
			} else {
				System.out.println("You are on :" + urPresentStep);
			}
		}
	}
}