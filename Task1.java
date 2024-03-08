package internship;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
 * TASK 1: Number Game
 */

public class Task1 {

	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.println("Welcome to the Number Game.\nThe System will generate a random number between 1-100.");
		System.out.println("You have to guess that random number.\nYour score will be the number of attempts you took to guess the number.\n");
		System.out.print("Enter the Number of Rounds(between 1-5)you want to play the Game:");
		int rounds=sc.nextInt();
		for(int i=1;i<=rounds;i++) {
		System.out.println();
		System.out.println("Round"+i+"begins...\n");
		System.out.println("Please Enter the Difficulty Level:\n1--> Easy[There is No Limit for number of attempts]\n2-->Hard[There is Limit for number of attempts]");
		int limits=sc.nextInt();
		
		switch(limits) {
		case 1:{
			System.out.println("Opted for Easy Difficuly.\nHense,there is No Limit to number of attempts\n");
			int randomNumber=1+rand.nextInt(100);
			System.out.println("Random Number has been generated...");
			int count=1;
			whileloop:while(true) {
				System.out.print("Enter your guess number" +count+":");
				int guess=sc.nextInt();
				if(guess>randomNumber) {
					System.out.println("The number" +guess+" is HIGHER than Generated Number.You have to guess again...");
				}
				else if(guess<randomNumber){
					System.out.println("The number"+guess+" is LOWER than Generated Number.You have to Guess again...");
				}
				else {
					System.out.println("The number"+guess+" is EQUAL to than Generated Number.\nCongrats it took you"+count+"attempts.");
					break whileloop;
				}
				count++;
			}
			break;
		}
		case 2:{
			System.out.println("Opted for Hard Difficuly.\nHense,there is a Limit to number of attempts");
			System.out.println("The limit is just 5.\nIf you have guessed the number is 5 or less attempts you have won the game.\n Else you will lose the game.\n");
			int randomNumber=1+rand.nextInt(100);
			System.out.println("Random Number has been generated...");
			int count=1;
			whileloop:while(count<=5) {
				System.out.println("\nNo of guesses remaining:"+(6-count)+"...\n");
				System.out.print("Enter you guess number"+count+":");
				int guess=sc.nextInt();
				if(guess>randomNumber) {
					System.out.println("The number"+guess+" is HIGHER than Generated Number.you have to Guess again...");
				}
				else if(guess<randomNumber) {
					System.out.println("The number"+guess+" is LOWER than Generated Number.You have to Guess again...");
				}
				else {
					System.out.println("The number"+guess+" is EQUAL to than Generated Number.\nCongrats it took you"+count+"attempts.");
					break whileloop;
				}
				count++;
			}
			if(count>5) {
				System.out.println("OOPS!!!You were not able to guess the number in 5 attempts.\nThe Generated Number ewas"+randomNumber+"\nBETTER LUCK NEXT TIME\n");
			}
			break;
		
		}
		default:{
			System.out.println("___\nWRONG INPUT___\n Sorry!!!But this round has been wasted.");
			break;
		}
		}
		System.out.println("Round"+i+"is OVER.");
		}
		System.out.println("\nAll the Rounds are over.\nThankYou for playing the Game.\nHope you enjoyed it.");
		sc.close();
		
      }

}

