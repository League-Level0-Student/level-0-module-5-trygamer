
import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

		String hi = JOptionPane.showInputDialog("how many dimes do you have");

		// Tell them how many cents they have (hint multiply by 10)

		int h = Integer.parseInt(hi);

		double h1 = h * .10;

		JOptionPane.showMessageDialog(null, "You have " + h1 + " cents");

		// Ask the user how tall they are (inches)

		String f = JOptionPane.showInputDialog("How tall are you?");

		// If they are shorter than 36 inches, tell them to eat their Wheaties

		int f1 = Integer.parseInt(f);

		if (f1 < 36) {
			JOptionPane.showMessageDialog(null, " eat your Wheaties");

		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console

		for (int i = 1; i > 31; i++) {
			if (i % 3 == 0) {
				System.out.println(i);

			}

		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console

		Random r = new Random();
		int r1 = r.nextInt(20);

		// Get another random number that is less than 10 and print it to the console
		int r2 = r.nextInt(10);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction

		int r3 = r1 - r2;

		JOptionPane.showMessageDialog(null, r1 + "-" + r2 + "=" + r3);

	}

	void skill4() { // In a pop-up, ask the user for the city they live in

		String f = JOptionPane.showInputDialog("What city do you live in");

		// If they answered "San Diego", tell them they live in Americ's Finest City

		if (f.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest city");
		}

		// Otherwise, tell them to move to San Diego

		else {
			JOptionPane.showMessageDialog(null, "Move to san dieg");
		}

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."

		int car = 3;

		if (car == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation.");

		}

		// If there is 1 car, use a pop-up to display the make/model of the car
		if (car == 1) {
			JOptionPane.showMessageDialog(null, "n/a.");
		}

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
		if (car < 1) {
			JOptionPane.showMessageDialog(null, "12 wheels.");
		}

	}

	void skill5() { // In a pop-up, ask the user for the name of their school

		String s = JOptionPane.showInputDialog(null, "What school do you go to?");

		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

		JOptionPane.showMessageDialog(null, s + " is fantastic");

	}
}
