package amailloux;

public class PokerDice {

	public static void main(String[] args){
		int[] tally = new int[7];
		
		for(int k = 0; k <1000000; k ++){
			 Die[] dice = new Die[5];
			 int[] count = new int[6];
			 	
		
		for(int i = 0; i < 5; i ++){
			dice[i]= new Die(6);
			dice[i].roll();
					
		}
		for (int i = 0; i < dice.length; i ++){
			count[dice[i].getValue()-1] ++;
		}
		int max = count[0];
		for(int i = 0; i <6; i ++){
			if(count[i] > max){
				max = count[i];
			}
		}
			if( max == 5){
				tally[6] ++;
			}
			else if(max == 4){
				tally[5] ++;
				
			}
			else if(max == 3){
				boolean house = false;
				for(int j = 0; j < 6; j++){
					if(count[j] == 2){
						tally[4] ++;
						house = true;
					}
					
				}
				if(house == false){
					tally[3] ++;
				}
			}
			else if(max == 2){
				boolean house = false;
				for(int j = 0; j < 6; j++){
					if(count[j] == 2){
						for(int m = j + 1; m < 6; m ++){
							if(count[m] == 2){
								tally[2]++;
								house = true;
							}
						}
						
						
					}
					
				}
				if(house == false){
					tally[1] ++;
				}
			}
			else{
				tally[0] ++;
			}
		}
		
		float noneAlike = (float)tally[0]/1000000;
		float onePair = (float)tally[1]/1000000;
		float twoPair = (float)tally[2]/1000000;
		float threeKind = (float)tally[3]/1000000;
		float fullHouse = (float)tally[4]/1000000;
		float fourKind = (float)tally[5]/1000000;
		float fiveKind = (float)tally[6]/1000000;
		
		
		
		
		
	
	
	System.out.println("Poker Dice Probability Calculator - A. Mailloux");
	System.out.println("Case 1. None alike is " + noneAlike);
	System.out.println("Case 2. One pair is " + onePair);
	System.out.println("Case 3. Two pair is " + twoPair);
	System.out.println("Case 4. Three of a kind is " + threeKind);
	System.out.println("Case 5. Full house is " + fullHouse);
	System.out.println("Case 6. Four of a kind is " + fourKind);
	System.out.println("Case 7. Five of a kind is " + fiveKind);
	
	
	
	
	}
	
	
}
