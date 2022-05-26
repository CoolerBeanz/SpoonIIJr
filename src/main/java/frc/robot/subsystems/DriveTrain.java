package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/*
  Note:
  DoubleSolenoid is not included in this code.
  Robot is currently using arcade drive.
*/

public class DriveTrain extends SubsystemBase {

  public MotorControllerGroup leftSide, rightSide;
  public Talon FL, FR, RL, RR;
  // ^ FrontLeft, FrontRight, RearLeft, RearRight
  public static DifferentialDrive drive;
  public static Joystick PS4Controller;

  public DriveTrain () {
    Talon FL = new Talon(3);
    Talon RL = new Talon(4);
    Talon FR = new Talon(1);
    Talon RR = new Talon(2);

    rightSide = new MotorControllerGroup(FR, RR);
    leftSide = new MotorControllerGroup(FL, RL);

    drive = new DifferentialDrive(leftSide, rightSide);

    leftSide.setInverted(true);

    // Other controllers will not work properly with this robot
    // because each different branded controller have different axis-es corresponding to the joysticks.
    PS4Controller = new Joystick(0);

  }

  static void arcadeDrive (double direction, double steering) {
    drive.arcadeDrive(direction, steering);
  }

  public static void main(String[] args) {
    arcadeDrive(-PS4Controller.getRawAxis(1), PS4Controller.getRawAxis(2));
  }

/*  double direction = -PS4Controller.getRawAxis(1);
    double steering = PS4Controller.getRawAxis(2);
    
    drive.arcadeDrive(direction, steering);
  }
*/

  @Override
  public void periodic() {

  }

  @Override
  public void simulationPeriodic() {

  }
}