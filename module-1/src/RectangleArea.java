import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Let's calculate the area of a rectangle.");
		System.out.println("Enter the length: ");
		int length = input.nextInt();
		System.out.println("Enter the width: ");
		int width = input.nextInt();
		
		int area = length * width;
		System.out.println("The area is " + area);

	}

}
