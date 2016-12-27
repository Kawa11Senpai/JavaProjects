package amailloux;
import java.util.Scanner;
public class Savings {

	public static void main(String[] args) {
		
				System.out.println("Simple Interest - A. Mailloux");
				Scanner sav;
				sav = new Scanner(System.in);
				System.out.println("What is the initial savings amount?");
				double pv;
				pv = Double.parseDouble(sav.nextLine());
				System.out.println("What is the number of months to save?");
				double n;
				n = Double.parseDouble(sav.nextLine());
				System.out.println("What is the annual interest rate?");
				double i;
				i = Double.parseDouble(sav.nextLine());
				double fv;
				fv = (pv*(Math.pow(1+i/100/12, n)))*100;
				fv = (int)fv;
				fv = (double)fv/100;
				System.out.println("$" + pv + " saved for " + n + " months at " + i +"% will be valued at");
				System.out.println("$" + fv);
				
				
			}
}


