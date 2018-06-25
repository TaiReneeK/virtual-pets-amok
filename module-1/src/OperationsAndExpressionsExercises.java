import java.text.NumberFormat;
import java.util.Locale;

public class OperationsAndExpressionsExercises {

	public static void main(String[] args) {

		// Lisa is cooking muffins. The recipe calls for 7 cups of sugar.
		// She has already put in 2 cups. How many more cups does she need to put in?

		int totalCups = 7;
		int cupsApplied = 2;
		int cupsRemaining = totalCups - cupsApplied;
		System.out.println("Lisa needs " + cupsRemaining + " cups.");

		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		double eaters = 4;
		double cost = 13.00;
		double totalPayment = cost * eaters;
		System.out.println("The total bill is " + currency.format(totalPayment));

		// Maria has boxes. She buys seven more. A week later, half of her boxes are
		// destroyed in a fire,
		// leaving her with 22 boxes. With how many did she start?

		int finalTotal = 22;
		int boxesBought = 7;
		int initialTotal = finalTotal * 2 - boxesBought;
		System.out.println(initialTotal + " boxes");

		// The sum of three consecutive numbers is 72. What is the smallest of these
		// numbers?
		// The sum of three consecutive even numbers is 48. What is the smallest of
		// these numbers?

		int totalNumber = 72;
		int firstNumber = 24;
		int secondNumber = 25;
		int smallestNumber = totalNumber - firstNumber - secondNumber;
		System.out.println(smallestNumber + " is the smallest number.");

		int totalEven = 48;
		int firstEven = 18;
		int secondEven = 16;
		int lastEven = totalEven - firstEven - secondEven;
		System.out.println("The smallest number is " + lastEven + ".");
		

	}

}
