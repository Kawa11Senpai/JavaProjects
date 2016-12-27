package amailloux;

import java.util.Scanner;

public class HangmanDriver {

	public static void main(String[] args) {
		System.out.println(" Hangman - A. Mailloux ");
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		
		Hangman a = new Hangman();
		a.initializeBoard();
		a.drawBoard();
		
		//converting to string to use contains so it can check for _
		while(new String(a.board).contains("_")){
			System.out.println(" ");
			System.out.println("Enter a letter: ");
			a.letter = keyboard.next().charAt(0);
			a.guess();
			a.drawBoard();
			
		}
		System.out.println(" ");
		System.out.println("You guessed in " + a.guessCount + " tries.");
	}

}
