package amailloux;
import java.util.Scanner;
public class NumberAboveAverage {

	public static void main(String[] args) {
		
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		
		int[] temperature = new int[10];
		double average;
		String days;
		int numCounter = 0; 
		for (int i = 0; i < 10; i ++){
			days = keyboard.nextLine();
			temperature[i] = Integer.parseInt(days);
		}
		
		average = tempAverage(temperature);
	
		for (int i = 0; i <10; i ++){
			if (temperature[i] > average)
				numCounter ++;
			
		}
		System.out.println(numCounter);
	
	}
	
	public static double tempAverage(int[] a){
		
		int numDays = a.length;
		double sum = 0;
		
		for(int i = 0; i < numDays; i ++){
			sum = sum + a[i];
			
		}
		
		return sum/numDays;
		
		
	}
	
	
	

}
