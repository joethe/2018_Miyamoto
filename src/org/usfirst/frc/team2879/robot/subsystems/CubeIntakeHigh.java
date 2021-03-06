package org.usfirst.frc.team2879.robot.subsystems;

import org.usfirst.frc.team2879.robot.RobotMap;
import org.usfirst.frc.team2879.robot.commands.ConstantIntake;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CubeIntakeHigh extends Subsystem {
	Talon left = new Talon(RobotMap.topIntakeLeft);
	Talon right = new Talon(RobotMap.topIntakeright);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
     	setDefaultCommand(new ConstantIntake(0.1,true));
    }
    
    public void go (double speed) {
    	left.set(speed);
    	right.set(-speed);
    }
}

