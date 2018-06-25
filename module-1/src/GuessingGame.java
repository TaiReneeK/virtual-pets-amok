import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int secretNumber = 5; // = (int) (Math.random() * 10) + 1;
		int count = 0;
		
		System.out.println("Enter a number between 1 and 10");
		int guessedNumber = input.nextInt();
		
		while(guessedNumber != secretNumber && count < 2) {
		
		} if (guessedNumber > secretNumber) {
			System.out.println("You guessed too high!");
			count++;
		} else {
			System.out.println("You guessed too low!");
			count++;
		} 
		
		System.out.println("Try again...");
		guessedNumber = input.nextInt();
			
	
	if (guessedNumber == secretNumber && count < 3) {
		System.out.println("You win!");
	} else {
		System.out.println("You lose!");
	}
			
}}
