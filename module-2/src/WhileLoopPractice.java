import java.util.Scanner;

public class WhileLoopPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int secretPin = 2345;
		int pinEntry = 2345;
		do 
		{
			System.out.println("Please insert your pin number.");
			pinEntry = input.nextInt();
			if (pinEntry != secretPin) 
			{
				System.out.println("Sorry, this is the wrong pin.");
			}
			else 
			{
				System.out.println("This pin is correct.");
			}
		}
		while (pinEntry != secretPin);
		input.close();
	}

}
