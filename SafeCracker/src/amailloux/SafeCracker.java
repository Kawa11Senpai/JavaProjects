package amailloux;
import java.util.*;
public class SafeCracker {

	public static void main(String[] args) {
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		
		System.out.println(" Safe Cracker Jr. - A. Mailloux ");
		
		System.out.println(" What is your guess? ");
		double getRandom = (int)(Math.random()*9999+1);
		int guess, game = 0;
		int score = 0;
		int highScore = 1000;
		int answer = (int)getRandom;
		String restart;
		
		
		while(true){
			
			guess = keyboard.nextInt();
			if (guess == answer) {
				if( score < highScore ){
					highScore = score;
				}
				
				System.out.println(" You got it! ");
				System.out.println(" Your score was:" + score);
				
				game++;
				getRandom = (int)(Math.random()*9999+1);
				answer = (int)getRandom;
				score = 0;
				
				System.out.print("Do you want to play again?");
				restart = keyboard.next();
				
				if(restart.equalsIgnoreCase("yes") || restart.equalsIgnoreCase("yeah")){
					System.out.println(" What is your guess? ");
				}else{
					break;
				}
				}else if (guess < answer){
					System.out.println(" You are too low. ");
				} else if (guess > answer) {
					System.out.println(" You are too high. ");
				}
				score++;
				
				
			}
		if( game > 0 ){
			System.out.println("That's a new best score! It took " + highScore + " guesses.");
			} 	
		}
		
		
		
	}


