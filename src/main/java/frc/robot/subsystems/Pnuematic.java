package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pnuematic extends SubsystemBase {

  DoubleSolenoid ds;
  PneumaticsControlModule pcm;
  Joystick PS4Controller;

    public Pnuematic() {
        ds = pcm.makeDoubleSolenoid(0, 7);

        PS4Controller = new Joystick(0);

        pcm.enableCompressorDigital();
    }
    
    @Override
    public void periodic() {

        if(PS4Controller.getRawButton(2)){
            ds.set(Value.kForward);
        
            }else if(PS4Controller.getRawButton(3)){
                ds.set(Value.kReverse);
            }
    }
    
    @Override
    public void simulationPeriodic() {
        
    }
}