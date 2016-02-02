package org.usfirst.frc.team3467.robot.commands;

import java.util.Vector;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3467.robot.OI;
import org.usfirst.frc.team3467.robot.subsystems.DriveBase.DriveBase;

public abstract class CommandBase extends Command {
	
	public static CommandBase cb;
	public static OI oi;
	public static DriveBase driveBase;
	public static Vector <Subsystem> subsystemlist;
	
	public static void init() {
		subsystemlist = new Vector<Subsystem>();
		
		oi = new OI();
		
		driveBase = new DriveBase();
		subsystemlist.addElement(driveBase);
		SmartDashboard.putString("Stuff", "Drivebase Made");
	}
	
	public CommandBase() {
		super();
		cb = this;
	}
	
	public CommandBase(String name) {
		super(name);
	}
	
}
