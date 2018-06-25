import java.util.Scanner;

public class LoopPracticeOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt user for a message then display it five times.
		// System.out.println("Enter a message!");
		// String message = input.nextLine();
		//
		// int count = 1;
		//
		// while (count <= 5) {
		// System.out.println(message);
		// count ++;
		// }

		// Create a simple number guess program
		int secretNumber = (int)(Math.random() * 3 + 1);
		
		System.out.println("Guess the number.");
		System.out.println("Enter your guess:");
		int guess = input.nextInt();

		while (guess != secretNumber) {
			System.out.println("Incorrect...guess again!");
			guess = input.nextInt();
		}

		System.out.println("You guessed it...great job!");
	}

}