package org.usfirst.frc.team3467.robot.subsystems.DriveBase.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3467.robot.commands.CommandBase;

public class TankDrive extends CommandBase {

	@Override
	protected void initialize() {
		requires(driveBase);
		SmartDashboard.putString("Stuff3", "Command init complete");
		
	}

	@Override
	protected void execute() {
		driveBase.driveTank(oi.getleft(), oi.getRight());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
