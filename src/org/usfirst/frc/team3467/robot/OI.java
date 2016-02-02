package org.usfirst.frc.team3467.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;

public class OI {

	public Joystick leftJoystick;
	public Joystick rightJoystick;
	
	public OI() {
		leftJoystick = new Joystick(1);
		rightJoystick = new Joystick(0);
	}
	
	public Joystick getleftJoystick() {
		return leftJoystick;
	}
	
	public Joystick getrightJoystick() {
		return rightJoystick;
	}
	
	public double getRight() {
		SmartDashboard.putString("OI Stuff1", "Got Right");
		return rightJoystick.getY();
	}
	
	public double getleft() {
		SmartDashboard.putString("OI Stuff2", "Got Left");
		return leftJoystick.getY();
	}
	
	public void BindCommands() {
		
	}
	
}

