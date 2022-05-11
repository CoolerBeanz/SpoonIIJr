package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/*
  Note:
  DoubleSolenoid is not included in this code.
*/
public class DriveTrain extends SubsystemBase {

  public final Talon m_leftMotorFront = new Talon(3);
  public final Talon m_leftMotorBack = new Talon(4);
  public final Talon m_rightMotorFront = new Talon(1);
  public final Talon m_rightMotorBack = new Talon(2);

  MotorControllerGroup rightSide = new MotorControllerGroup(m_rightMotorFront, m_rightMotorBack);
  MotorControllerGroup leftSide = new MotorControllerGroup(m_leftMotorFront, m_leftMotorBack);

  private final DifferentialDrive drive = new DifferentialDrive(m_leftMotorFront, m_rightMotorFront);
  // Other controllers will not work properly with this robot
  // because each different branded controller have different axis-es corresponding to the joysticks.
  private final Joystick PS4Controller = new Joystick(0);

  @Override
  public void periodic() {
    drive.arcadeDrive(-PS4Controller.getY(), PS4Controller.getX());
  }

  @Override
  public void simulationPeriodic() {

  }

}