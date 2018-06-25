import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {

		// int count = 1;
		// while(count <= 10) {
		// System.out.println("Count is " + count);
		// count++;
		// }

//		for (int count = 1; count <= 10; count++) {
//			System.out.println("Count is " + count);
//		}
		
		Scanner input= new Scanner(System.in);

		String name = "Ohio";
		
		//String traversal, printing one letter at a time
		for(int i=0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		//Reverse the string
		for(int i=3; i>0; i--) {
			System.out.println(name.charAt(i));
		}
		
	}	
}
