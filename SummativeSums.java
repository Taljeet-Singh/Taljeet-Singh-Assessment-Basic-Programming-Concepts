package JavaBasicProgrammingConceptsAssessment;

public class SummativeSums {

	public static void main(String[] args) {
		
		int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
		int[] array2 = {999, -60, -77, 14, 160, 301};
		int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 
						120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
		CalculateSum(array1);
		CalculateSum(array2);
		CalculateSum(array3);

	}
	
	public static int CalculateSum(int[] numbers) {
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			sum = sum + numbers[i];
			
		}
		
		System.out.println("Array Sum: " + sum);
		return sum;
	}

}
