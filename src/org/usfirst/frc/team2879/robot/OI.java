package org.usfirst.frc.team2879.robot;

import org.usfirst.frc.team2879.robot.commands.SuckInCube;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new DriveMecanumStick());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new DriveMecanumStick());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new DriveMecanumStick());
	
	Joystick stick = new Joystick(RobotMap.joystickport);

	
	public Joystick GetJoystick() {
		return stick;
	}
	
	public double getStickX() {
		return stick.getX()*stick.getX();
	}
	
	public double getStickY() {
		return stick.getY()*stick.getY();
	}
	
	public double getStickTwist() {
		return stick.getTwist()*stick.getTwist();
	}
	public void Init() {
		new JoystickButton(stick, 6).whileHeld(new SuckInCube(.5));
	}
		
}
