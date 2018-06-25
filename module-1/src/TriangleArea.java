import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Let's calculate the area of a triangle!");
		System.out.println("Enter the base: ");
		double base = input.nextDouble();
		System.out.println("Enter the height: ");
		double height = input.nextDouble();
		double area = base * height / 2;
		System.out.println("The area is " + area);
		
		input.close();

	}

}
