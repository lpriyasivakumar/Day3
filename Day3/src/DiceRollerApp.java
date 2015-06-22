import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		// Create a scanner instance
		Scanner sc = new Scanner(System.in);
		
		//header
		System.out.println("Welcome to Grand Circus Casino:");
		
		//Prompt user before rolling dice
		String choice = Validator.getChoice(sc, "Roll the dice (y/n): ");

		if (choice.equalsIgnoreCase("y")) {
			int sides = Validator.getInt(sc, "Enter the number of sides: "); //accepts the number of sides

			PairOfDice pair = new PairOfDice(sides);//create a pair of dice with user specified number of sides

			pair.roll();
			int roll1 = pair.getValue1();//get the value of the first die
			int roll2 = pair.getValue2();//get the value of second die

			System.out.println(roll1);
			System.out.println(roll2);
			
			//enter message based on the rolls or sum of the rolls
			if (roll1 == 1 && roll2 == 1) {

				System.out.println("Oooh...SnakeEyes!!!");
			} else if (roll1 == 6 && roll2 == 6) {
				System.out.println("Yay!!BoxCars");
			} else if ((roll1 + roll2 == 7) || (roll1 + roll2 == 11)) {
				System.out.println("If this were a game of Craps..you've Won");
			}
			//System.out.println("The sum of the two sides is: " + pair.getSum());

		}

		sc.close();

	}

}
