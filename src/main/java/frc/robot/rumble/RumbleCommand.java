package frc.robot.rumble;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;


/** An example command that uses an example subsystem. */
public class RumbleCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  
  private final double m_rumbleDuration;
  private final double m_rumblePower;
  private double startingTime;
  

  public RumbleCommand(double rumbleDuration, double rumblePower) {
          m_rumbleDuration = rumbleDuration;
          m_rumblePower = rumblePower;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    RobotContainer.joystick.setRumble(RumbleType.kBothRumble, m_rumblePower); 
    startingTime = Timer.getFPGATimestamp();
    }   

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    if(isFinished()){
      RobotContainer.joystick.setRumble(RumbleType.kBothRumble, 0);
    }
    }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (Timer.getFPGATimestamp() - startingTime >= m_rumbleDuration);
  }
}