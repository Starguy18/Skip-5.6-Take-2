package org.usfirst.frc.team3467.robot.subsystems.DriveBase;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CANTalon;

import org.usfirst.frc.team3467.robot.subsystems.DriveBase.commands.TankDrive;
import org.usfirst.frc.team3467.robot.RobotMap;

public class DriveBase extends Subsystem {

	public static CANTalon leftTalon;
	public static CANTalon rightTalon;
	public static DriveBase instance;
	
	public DriveBase getinstance() {
		return instance;
	}
	
	public DriveBase() {
		instance = this;
		leftTalon = new CANTalon(RobotMap.DriveBase_leftTalon);
		rightTalon = new CANTalon(RobotMap.DriveBase_rightTalon);
		SmartDashboard.putString("Stuff1", "Constructor complete");
	}
	
	protected void initDefaultCommand() {
		this.setDefaultCommand(new TankDrive());
		SmartDashboard.putString("Stuff2", "Default Method Set");
	}// TODO Auto-generated method stub

	public void driveTank(double left, double right) {
		leftTalon.set(left);
		rightTalon.set(right);
	}
}
