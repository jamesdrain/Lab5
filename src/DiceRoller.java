import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int numSides;
		int firstRoll;
		int secondRoll;
		String rollAgain = "y";
		
		// get user input 

		System.out.println("Let's roll some dice!!\nHow many sides per die?");
		numSides = scnr.nextInt();

		while (rollAgain.equalsIgnoreCase("y")) {
			
			// Call my methods into main
			
			firstRoll = rollFirstDie(numSides);
			secondRoll = rollSecondDie(numSides);
			
			// Print results

			System.out.println("Ok, you rolled " + firstRoll + " and " + secondRoll);

			if ((firstRoll == 1) && (secondRoll == 1)) {
				System.out.println("Snake Eyes!");
			}
			if ((firstRoll == 6) && (secondRoll == 6)) {
				System.out.println("Box Cars!");
			}
			if ((firstRoll + secondRoll == 7) || (firstRoll + secondRoll == 11)) {
				System.out.println("That's Craps!!");
			}
			
			// Continue based on user input

			System.out.println("Want to roll again");
			rollAgain = scnr.next();
			if (!rollAgain.equalsIgnoreCase("y")) {
				System.out.println("Ok, bye.");
			}
		}
		scnr.close();
	}
// Random number generator
	public static int rollFirstDie(int numSides) {

		int firstRoll;
		Random randGen = new Random(); 
		firstRoll = randGen.nextInt(numSides) + 1;
		return firstRoll;

	}
// Math.random
	public static int rollSecondDie(int numSides) {

		int secondRoll;
		secondRoll = (int) (Math.random() * numSides) + 1;
		return secondRoll;
	}

}
