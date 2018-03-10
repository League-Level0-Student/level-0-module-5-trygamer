import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		// 1. Create a robot
		Color color = new Color(0, 0, 0);
		Robot k = new Robot();
		// 2. Set the speed to 100
		k.setSpeed(1000);
		k.hide();
		k.penDown();

		int colorChoice = JOptionPane.showOptionDialog(null, "hello what color?", "title",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "red", "blue", "green" }, 0);

		if (colorChoice == 0) {
			color = new Color(255, 0, 0);

		}

		else if (colorChoice == 1) {
			color = new Color(0, 0, 255);

		}

		else if (colorChoice == 2) {
			color = new Color(0, 255, 0);

		}

		// 3. Set the pen color of the robot according to the value of the colorChoise
		// variable
		k.setPenColor(color);
		// 4. Ask the use how many polygons they want to be drawn.
		String num = JOptionPane.showInputDialog("how many polygons want to be drawn? ");

		int num1 = Integer.parseInt(num);
		// 5. Use the robot to draw the number of polygons the user requested.

		for (int i = 0; i < num1; i++) {
			k.penDown();
			k.move(25);
			k.turn(90);
			k.move(25);
			k.turn(90);
			k.move(25);
			k.turn(90);
			k.move(25);
			k.penUp();
			k.setAngle(90);
			k.move(30);

		}

		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
