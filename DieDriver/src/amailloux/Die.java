package amailloux;
import java.util.Random;

public class Die {
	
	private Random spork = new Random();
	
	private int numSides;
	private int value;
	private boolean frozen;
	
	public Die(int numSides){
		
		this.numSides=numSides;
		this.value = 1;
	}
	
	public Die(){
	
		this.numSides = 6;
		this.value = 1;
	}
	
	public void setValue(int v){
		
		
		if(frozen == false){ 
			if ( 0 < v && v <= numSides){
				this.value = v;
			}
			else{
				System.out.println("***Attemped to set value to "+ v + ", assumed 1.");
				this.value = 1;
			}
			
		}
		
		
		
	}
	
	public int getValue(){
		
		return this.value; 
		
	}
	
	public void roll(){
		if(frozen == false){
			value = spork.nextInt(numSides)+1;}
	}
	
	public void print(){
		
		System.out.print("["+value+":"+numSides+"] ");
		
	}
	
	public void draw(){
		if(numSides > 6){
			print();
		}else{
			System.out.println(".......");
			System.out.println(".     .");
			//Top of Dice
			if(value == 1){
				System.out.println(".     .");
			}else if(value == 2 ||value == 3){
				System.out.println(".*    .");
				
			}else{
				System.out.println(". * * .");
			}
			//Middle of Dice
			if(value % 2 == 1){
				System.out.println(".  *  .");
			}else if(value == 6){
				System.out.println(". * * .");
			}else{
				System.out.println(".     .");
			}
			//Bottom of Dice
			if(value == 1){
				System.out.println(".     .");
			}else if(value == 2 ||value == 3){
				System.out.println(".    *.");
				
			}else{
				System.out.println(". * * .");
			}
			System.out.println(".     .");
			System.out.println(".......");
		}
	}
	
	public void freeze(){
		frozen = true; 
		
	}
	
	public void unfreeze(){
		frozen = false;
	}
	
	
	
}
