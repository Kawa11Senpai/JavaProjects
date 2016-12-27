package amailloux;
import java.util.Random;
public class Hangman {
	
	public String usedLetter = " ";
	public char letter;
	int guessCount;
	//has to be uppercase word for dictionary
	public String[] dictionary = {"ONE", "TWO", "THREE"};
	Random spork = new Random();
	String answer = dictionary[spork.nextInt(3)];
	public char[] board = new char[answer.length()];
	
	
	public void initializeBoard(){
		//Picks a random word from dictionary and prints spaces
		for (int i = 0; i < answer.length(); i ++){
			
			board[i]= '_'; 
		}
		
	}
	
	public void drawBoard(){
		//Prints stuff
		for (int i = 0; i < answer.length(); i ++){
			System.out.print(board[i] + " ");
			
		}
		System.out.print(" Used letters: {"+ usedLetter + "}");
	}
	
	public void guess(){
		
		letter = Character.toUpperCase(letter);
		//Testing to see if letter has been used
		for(int i = 0; i < usedLetter.length(); i ++){
			if (usedLetter.charAt(i) == letter){
				return;
				
			}
		}
		//checks to see if the guess is inside answer
		for(int i = 0; i < answer.length(); i ++){
			if (answer.charAt(i) == letter){
				board[i] = letter;
				
			}
			
		}
		guessCount ++;
		usedLetter = usedLetter + letter;
		usedLetter.toUpperCase();
	}
	
	
	
	
	


	
}
