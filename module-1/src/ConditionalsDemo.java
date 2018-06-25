import java.util.Scanner;
public class ConditionalsDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 15;

		if (age < 15) {
			System.out.println("Use your bike.");
		} else if (age < 16) {
			System.out.println("You cannot drive without supervision.");
			System.out.println("Get your learners permit.");
		} else {
			System.out.println("You can drive.");
		}
		
		System.out.println("How are you feeling(great, ok, bad)");
		String feeling = input.nextLine();
		
		if (feeling.equalsIgnoreCase("great")) {
			System.out.println("You are feeling great!");
		} else if (feeling.equalsIgnoreCase("ok")) {
			System.out.println("You are feeling ok.");
		} else {
			System.out.println("Hope you are feeling better soon.");
		}

		input.close();
	}
}
