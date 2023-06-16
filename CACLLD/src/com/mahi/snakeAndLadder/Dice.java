package com.mahi.snakeAndLadder;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {

	int diceCount;
 
	int min =1;
	int max =6;
	
	public Dice(int diceCount) {
		super();
		this.diceCount = diceCount;
	}

	public int rollDice() {
		 int totalSum=0;
		 int i =diceCount;
		while(i>0) {
			totalSum += ThreadLocalRandom.current().nextInt(min, max+1);
			i--;
		}
		return totalSum;
	}
	
}
