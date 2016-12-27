package amailloux;
import java.util.Scanner;
public class CharacterFrequency {

	
	public static void main(String[] args) {
		
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		int[] count = new int [10];
		String phoneNumber = keyboard.nextLine();
		
		for(int i = 0; i < 10; i ++){
			
			char a = phoneNumber.charAt(i);
			int b = Character.getNumericValue(a);
			count[b] ++;
			
		}
		for (int i = 0; i < count.length; i ++){
			System.out.print(count[i]);
		}
	}
}


