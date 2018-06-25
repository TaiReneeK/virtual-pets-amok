
public class RandomDemo {

	public static void main(String[] args) {
		
		int count = 0;
		
		while (count < 50) {
		int randomNumber = (int) (Math.random() * 10) + 1;
		System.out.println(randomNumber);
		count++;
		}
	}
}
