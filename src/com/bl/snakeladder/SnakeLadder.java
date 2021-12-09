package com.bl.snakeladder;

public class SnakeLadder {
	public static void main(String[] args) {
		int countForPlayerOne = 0, countForPlayerTwo = 0;
		final int DECIDE_PLAYER = 0, WINNING_POSITION = 100, STARTING_POSITION = 0;
		int playerOne = 0, playerTwo = 0, count = 0;

		while (playerOne < 100 && playerTwo < 100) {
			if (count % 2 == DECIDE_PLAYER) {
				System.out.println("PlayerOne is Playing");
				int playValueOne = playingGame();
				playerOne = playerOne + playValueOne;
				if (playerOne < STARTING_POSITION)
					playerOne = 0;
				if (playerOne > WINNING_POSITION)
					playerOne = playerOne - playValueOne;
				System.out.println("playerOne position is :" + playerOne);
				countForPlayerOne++;
			} else {
				System.out.println("PlayerTwo is Playing");
				int playValueTwo = playingGame();
				playerTwo = playerTwo + playValueTwo;
				if (playerTwo < STARTING_POSITION)
					playerTwo = 0;
				if (playerTwo > WINNING_POSITION)
					playerTwo = playerTwo - playValueTwo;
				System.out.println("PlayerTwo Position is :" + playerTwo);
				countForPlayerTwo++;
			}
			if (playerOne == WINNING_POSITION)
				System.out.println("playerOne Winner");
			else if (playerTwo == WINNING_POSITION)
				System.out.println("playerTwo Winner");
			count++;
		}
		System.out.println("playerOne rolls " + countForPlayerOne + " times");
		System.out.println("playerTwo rolls " + countForPlayerTwo + " times");
	}

	static int playingGame() {
		int diceNumber = rollingDie();
		final int SNAKE = 1;
		final int LADDER = 2;
		int playValue = 0;
		switch (forOptions()) {
		case SNAKE:
			System.out.println("It is a Snake");
			playValue = playValue - diceNumber;
			break;
		case LADDER:
			System.out.println("It is a Ladder");
			playValue = playValue + diceNumber;
			int playAgain = playingGame();
			playValue = playAgain + playValue;
			break;
		default:
			System.out.println("No Play");
		}
		return playValue;
	}

	static int forOptions() {
		int options = (int) Math.floor(Math.random() * 3);
		System.out.println("The option you get :" + options);
		return options;
	}

	static int rollingDie() {
		int dieValue = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The number on dice is :" + dieValue);
		return dieValue;
	}
}