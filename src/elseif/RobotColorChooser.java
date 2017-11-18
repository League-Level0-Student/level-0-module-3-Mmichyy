
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
int numColor=1;
String color=JOptionPane.showInputDialog("enter a color");
Robot r2d2=new Robot();
if(color.equals("blue")){  
r2d2.setPenColor(Color.blue);
if(color.equals("red")){;
r2d2.setPenColor(Color.red);
r2d2.move(70);
r2d2.turn(100);
r2d2.move(70);
r2d2.turn(100);
r2d2.move(70);
r2d2.turn(100);
r2d2.setPenWidth(10);

}

}
		//3. ask the user what color they would like the robot to draw
		
		//4. use an if/else statement to set the pen color that the user requested
		
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)


	}
}
