package com.qa.Swampy;
import java.util.Random;
import java.util.Scanner;
public class Swampy {
private static Scanner in;

public static void main (String[] args) {

	//System objects

		in = new Scanner(System.in);

		Random rand = new Random();
		

    //Game variables

	

		int maxDistance = 100;

		int blowingWinds = 25;

	//Player variables

		int health = 100;

		int attackDamage = 30;

		int numSwampyPotions = 3;

		int healthPotionHealAmmount = 50; 

		


  
boolean running = true;

	System.out.println(" 'Mysterious man in the sky speaks' ");
	System.out.println("Lost, young Master? For you have entered the Kingdom of Moor.");
	System.out.println("It is hard to see, but you have been equiped with a magic compass.");
	System.out.println("Trust the hands and you shall soon find your way.");
	System.out.println("Good luck on your Quest!");
	
	
	Swampy:
		while(running) {

			System.out.println("-------------------------------");	
			
			System.out.println("\t# Which way would you like to go? #\n ");
			System.out.println("\t Type in your direction of choice (tip. n,e,s,w...) \n ");
			
			         System.out.println("\t     N ");
				      System.out.println("\t     ^");	
				      System.out.println("\t W <   > E");	
				      System.out.println("\t     v ");
				      System.out.println("\t     S ");
				      
			
			String input = in.nextLine();
			
			
			
			
			if(input.equals("n")) {
				int damageDealt = rand.nextInt(attackDamage);
				int goldCoins = rand.nextInt(blowingWinds);
				
				maxDistance -= damageDealt;
				health -= goldCoins;
				
				System.out.println("\t> You strike the winds to move forward, you move " + Math.random() + "  KM forward");
				System.out.println("\t> You recieve" + " " + goldCoins + " " + "gold coins!");
				
				if(health < 1) {
					System.out.println("\t> You have taken to much damage, you're too weak to go on young Master... ");
					break;
					
				}
			}
			
			else if(input.equals("e")) {
				 if (numSwampyPotions > 0) {
					int healthPotionsHealAmmount = 0;
					health += healthPotionsHealAmmount;
					numSwampyPotions--;
					System.out.println("You drink swamp water potion, healing yourself from the winds for" + " " + healthPotionHealAmmount + "." 										
											+"\n\t> You now have " + health + "HP."
											+"\n\t> You have" + " " + numSwampyPotions + " Swampy Potions left.\n"
					                        +"\n\t> You run " +  Math.random() + "  KM forward" + "!");
					
				}
				 else {
					 System.out.println("\t> You have no Swampy potions left! Defeat the winds to gain some!\n ");
					 
				 }
				
			
			}	
			if(input.equals("s" )) {
				System.out.println("\t You run " +  Math.random() + " KM forward" + "!");
			
			}
			
			
			
			else {
				System.out.println("\t ...");
			}
			
			
			
		
		if(input.equals("w" )) {
			
			System.out.println("\t You run " +  Math.random() + "  KM forward" + "!");
			
		}
		
		
		
		else {
			System.out.println("\t ...");
		}

	
	
if(health < 1) {
	System.out.println("You are dying! ");
	
}
System.out.println("-------------------------------");	
System.out.println(" # the winds on this side have blown you off track! # ");
System.out.println("  # You have" + " " + health + "HP left # " );
int healthPotionDropChance = 0;
if(rand.nextInt(100) < healthPotionDropChance) {
	numSwampyPotions++;
	System.out.println(" # The gods have " + "dropped a Swampy Potion! # ");
	System.out.println(" # You now have " + numSwampyPotions + " Swampy potion(s). # ");
	
}
System.out.println("-------------------------------");	
System.out.println("What would you like to do now?");	
System.out.println("1. Continue playing");	
System.out.println("2. Collect reward");	
{

	
	
String inputs = in.nextLine();

while(!inputs.equals("1") && !input.equals("2")) {
	
	System.out.println("Congratulations young Master!");
	System.out.println("You have recieved lots of treasure $$$," );
	System.out.println("but it's all in bitcoin :(" );
	System.out.println("I hope to see you again soon, SON ... dun dun dunnnnn");
	inputs = in.nextLine();
}
if(inputs.equals("2")) {
	System.out.println("There are wild things beyond the fog!");
	System.out.println("You have achieved the power of resilience (R)" );

	System.out.println("");
	
}
else {
	System.out.println("...");
}

System.out.println("####################################");	
System.out.println("# Your a fine young Master! #");	
System.out.println("####################################");	
		
		


}
}}}




