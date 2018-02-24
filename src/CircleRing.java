/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {

        // 1. Make a new Robot
Robot k= new Robot();

       //  2. Set your robot’s position to x=150 and y=200
k.hide();
k.moveTo(150, 200);
        // 3. Put the robot's pen down
k.penDown();
        // 4. Set the robot’s speed to 10
k.setSpeed(10);
        // 5. Do everything below here 360 times (use i as the counter)
for(int i=1; i<361;i++ ) {
	k.move(3);
	
	k.turn(1);
	
	if(i%20==0) {
		
		for(int j=1; j<361; j++) {
			
			k.move(1);
			k.turn(1);
			
			
			
		}
		
	}
	
	
	
}




	        // 6. Move the robot 3 pixels

       //  7. Turn the robot 1 degree

        // 8. If the counter i is divisible by 20 (hint: use mod operator  %)


        // 9. Do steps 10 thru 12, 360 times (use j as the counter)

		        // 10. Move the robot 1 pixel

		        // 11. Turn the robot 1 degree
}
}
