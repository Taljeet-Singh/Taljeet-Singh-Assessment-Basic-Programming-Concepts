package JavaBasicProgrammingConceptsAssessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

	public static void main(String[] args) {
		
		Scanner scannerName = new Scanner(System.in);
		
		System.out.println("What is your dog's name? ");
		
		//Name input
		String name = scannerName.nextLine();
		
		System.out.println("Well then, I have this highly reliable report on " + name + 
				"'s prestigious background right here.");
		
		//Generating random numbers for the 5 dog breeds
		Random ranGeneticNum = new Random();
		int sum = 0;
		int firstDogBreed = 0;
		int secondDogBreed = 0;
		int thirdDogBreed = 0;
		int fourthDogBreed = 0;
		int fifthDogBreed = 0;
		
		while(sum != 100) {
			firstDogBreed = ranGeneticNum.nextInt(100);
			secondDogBreed = ranGeneticNum.nextInt(100-firstDogBreed);
			thirdDogBreed = ranGeneticNum.nextInt(100-secondDogBreed);
			fourthDogBreed = ranGeneticNum.nextInt(100-thirdDogBreed);
			fifthDogBreed = ranGeneticNum.nextInt(100-fourthDogBreed);
			
			sum = firstDogBreed + secondDogBreed + thirdDogBreed + fourthDogBreed + fifthDogBreed;
		}
		
		System.out.println(firstDogBreed + "% St. Bernard");
		System.out.println(secondDogBreed + "% Chihuahua");
		System.out.println(thirdDogBreed + "% Dramatic RedNosed Asian Pug");
		System.out.println(fourthDogBreed + "% Common Cur");
		System.out.println(fifthDogBreed + "% King Doberman");
		
		System.out.println("Wow, that's QUITE the dog!");
		
	}

}

