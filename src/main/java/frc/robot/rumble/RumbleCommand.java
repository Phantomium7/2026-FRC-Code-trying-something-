import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;


/** An example command that uses an example subsystem. */
public class RumbleCommand extends InstantCommand {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})


  public RumbleCommand() {
          super(() -> RobotContainer.joystick.setRumble(RumbleType.kBothRumble, 0.5)); 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    }   

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}