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
    pcm = new PneumaticsControlModule(1);
    //  ds = new DoubleSolenoid(0, null, 0, 0);
    PS4Controller = new Joystick(0);

    ds = pcm.makeDoubleSolenoid(0, 7);

    PS4Controller = new Joystick(0);

    pcm.enableCompressorDigital();
  }

  public void dsSwitch(boolean enabled) {

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