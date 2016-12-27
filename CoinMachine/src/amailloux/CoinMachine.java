package amailloux;
import java.util.Scanner;
public class CoinMachine {

	public static void main(String[] args) {
		System.out.println("Coin Machine - A. Mailloux");
		Scanner coin;
		coin = new Scanner(System.in);
		System.out.println("Enter amount owed:");
		float owed = coin.nextFloat();
		System.out.println("Enter amount recieved:");
		float recieved = coin.nextFloat();
		float change = (recieved-owed);
		System.out.println("Your change today is " + "$" + change);
		int amt1 = 0;
		int amt2 = 0;
		int amt3 = 0;
		int amt4 = 0;
		int amt5 = 0;
		int amt6 = 0;
		int amt7 = 0;
		int amt8 = 0;
		int amt9 = 0;
		int amt10 = 0;
		
		while (change >= 5.00f){
			amt1 ++;
			change= change - 5.00f;
		} 
		System.out.println("500-cents: " + amt1);
		
		while (change >= 1.00f){
			amt2 ++;
			change = change - 1.00f;
		}
		System.out.println("100-cents: " + amt2);
		
		while (change >= .50f){
			amt3 ++;
			change = change - .50f;
		}
		System.out.println("50-cents: " + amt3);
		
		while (change >= .25f){
			amt4 ++;
			change = change - .25f;
		}
		System.out.println("25-cents: " + amt4);
		
		while (change >= .20f){
			amt5 ++;
			change = change - .20f;
		}
		System.out.println("20-cents: " + amt5);
		
		while (change >= .10f){
			amt6 ++;
			change = change - .10f;
		}
		System.out.println("10-cents: " + amt6);
		
		while (change >= .05f){
			amt7 ++;
			change = change - .05f;
		}
		System.out.println("5-cents: " + amt7);
		
		while (change >= .03f){
			amt8 ++;
			change = change - .03f;
		}
		System.out.println("3-cents: " + amt8);
		
		while (change >= .02f){
			amt9 ++;
			change = change - .02f;
		}
		System.out.println("2-cents: " + amt9);
		
		while (change >= .001f){
			amt10 ++;
			change = change - .01f;
		}
		System.out.println("1-cents: " + amt10);
		
	}

}
