package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pnuematic extends SubsystemBase {

  //boolean enabled;
  //boolean disabled;
  DoubleSolenoid ds;
  PneumaticsControlModule pcm;
  Joystick PS4Controller;

    public Pnuematic() {
        ds = pcm.makeDoubleSolenoid(0, 7);
        pcm.enableCompressorDigital();

        PS4Controller = new Joystick(0);
    }

    public void dsSwitch(boolean enabled) { 
        
        /* Previous verison (not tested yet)

        enabled = PS4Controller.getRawButton(2);
        disabled = PS4Controller.getRawButton(3);
        
        if(enabled = true){
            ds.set(Value.kForward);
        }
        else if(disabled = true){
            ds.set(Value.kReverse);
        }
        */

        if(enabled = true){
            ds.set(Value.kForward);
        
        }else if(enabled = false){
            ds.set(Value.kReverse);
        }
    }
    
    @Override
    public void periodic() {

    }
    
    @Override
    public void simulationPeriodic() {
        
    }
}