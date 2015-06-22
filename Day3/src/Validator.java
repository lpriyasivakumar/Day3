import java.util.Scanner;

public class Validator {

	public static double getDouble(Scanner sc, String prompt) {
		double i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				i = sc.nextDouble();
				isValid = true;
			} else {
				System.out
						.println("Error! Invalid double. Enter a double value");
			}
			sc.nextLine();
			sc.close();
		}
		return i;
	}

	public static double getDoubleInRange(Scanner sc, String prompt,
			double min, double max) {
		double i = getDouble(sc, prompt);
		boolean isValid = false;
		while (isValid == false) {
			if ((i < min) || (i > max)) {
				System.out.printf("Error: number should be between %f and %f.",
						min, max);
				i = getDouble(sc, prompt);
			} else {
				isValid = true;
			}
		}

		sc.nextLine();
		sc.close();
		return i;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid Integer value. Try Again.");
			}
			sc.nextLine();
			sc.close();
		}
		return i;
	}

	public static int getIntInRange(Scanner sc, String prompt, int min, int max) {
		int i = getInt(sc, prompt);
		boolean isValid = false;
		while (isValid == false) {
			if ((i < min) || (i > max)) {
				System.out.printf("Error: number should be between %s and %s.",
						min, max);
				i = getInt(sc, prompt);
			} else {
				isValid = true;
			}
			sc.nextLine();
			sc.close();
		}
		return i;
	}

	public static String getString(Scanner sc, String prompt) {
		System.out.println(prompt);
		String response = sc.next();
		sc.nextLine();
		return response;
	}

	public static String getChoice(Scanner sc, String prompt) {
		String choice = "";
		boolean isValid = false;
		choice = getString(sc, prompt);
		while (isValid == false) {
			if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
				isValid = true;
			} else {
				System.out.print("Invalid answer!!");
				choice = getString(sc, prompt);
			}
		}
		return choice;
	}

}
