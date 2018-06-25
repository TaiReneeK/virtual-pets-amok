import java.text.DecimalFormat;

public class NestedLoopPractice {

	public static void main(String[] args) {
		
		DecimalFormat paddedFormat = new DecimalFormat("00");
		
//		for (int hours = 1; hours < 3; hours++) {
//			  for (int minutes = 0; minutes < 60; minutes += 5) {
//			    System.out.println("The time is " + hours + ":" + minutes);
//			  }
		
		for (int hours = 1; hours < 3; hours++) {
			  String paddedHours = paddedFormat.format(hours);
			  for (int minutes = 0; minutes < 60; minutes += 5) {
			    String paddedMinutes = paddedFormat.format(minutes);
			    String paddedTime = paddedHours + ":" + paddedMinutes;
			    System.out.println("The time is " + paddedTime);
			  }
			}
		}
	}
