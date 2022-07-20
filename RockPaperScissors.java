package JavaBasicProgrammingConceptsAssessment;

import java.util.*;

public class RockPaperScissors {
	
	public static void rpsPrintChoice() {
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.println("Please enter your move: ");
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		
		
		
		
		while(true) {
			int userChoice;
			int compChoice;
			int userWins = 0;
			int compWins = 0;
			int tie = 0;
			
			System.out.println("Please enter the amount of rounds you want to play");
			int roundChoice = scanner.nextInt();
			
			if(roundChoice < 1 || roundChoice > 10) {
				System.out.println("Invalid input, please enter rounds between 1 to 10 next time you play :)");
				System.exit(0);
			}
			
			for(int i = 0; i < roundChoice; i++){
				rpsPrintChoice();
				userChoice = scanner.nextInt();
				compChoice = rand.nextInt(3)+1;
					
				if(userChoice == compChoice) {
					tie = tie + 1;
					System.out.println("Tie");
				}
				else if(userChoice == 1) {
					if(compChoice == 2) {
						compWins = compWins + 1;
						System.out.println("Computer won, unlucky");
					}
					else if(compChoice == 3) {
						userWins++;
						System.out.println("You won yay");
					}
				}
				
				else if(userChoice == 2) {
					if(compChoice == 1) {
						userWins = userWins + 1;
						System.out.println("You won yay");
					}
					else if(compChoice == 3) {
						compWins = compWins + 1;
						System.out.println("Computer won, unlucky");
					}
				}
				
				else if(userChoice == 3) {
					if(compChoice == 1) {
						compWins = compWins + 1;
						System.out.println("Computer won, unlucky");
					}
					else if(compChoice == 2) {
						userWins = userWins + 1;
						System.out.println("You won yay");
					}
				}
			} // end of for loop
			
			System.out.println("Ties: " + tie);
			System.out.println("User wins: " + userWins);
			System.out.println("Computer wins: " + compWins);
			
			if(userWins > compWins) {
				System.out.println("Overall winner: You");
			} 
			else if (compWins > userWins) {
				System.out.println("Overall winner: Computer");
			}
			else {
				System.out.println("Over Winner Tie");
			}
			
			System.out.println("Do you want to play again? y or n");
			
			String answer = scanner.next();
			if(answer.equals("y")) {
				continue;
			}
			else {
				break;
			}

	  }
	}
	


}
