import java.util.Scanner;

public class ForLoopQuizQuestions {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);

//	System.out.println("Enter a number from 0 to 11.");
//	int numberEntry = input.nextInt();
//	
//	for(int i=0; i<=numberEntry; i++) {
//		System.out.println(numberEntry + i);
//	}
//	
//	System.out.println("I just counted to 11!");
	
	System.out.println("Enter a name.");
	String nameEntry = input.nextLine();
	
	for(int i=4; i>0; i--) {
		System.out.println(nameEntry.charAt(i));
	}
	}

}
