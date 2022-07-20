package JavaBasicProgrammingConceptsAssessment;
import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		
		Scanner scannerAge = new Scanner(System.in);
		
		System.out.println("What is your age? ");
		
		//Age input
		int age = scannerAge.nextInt();
		
		int maxHeartRate = 220 - age;
		
		System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute" );
		
		double minRange = 0.5 * maxHeartRate;
		double maxRange = 0.85 * maxHeartRate;
		
		System.out.println("Your target HR Zone is " + Math.round(minRange) + " - " + Math.round(maxRange) + " beats per minute");

	}

}
