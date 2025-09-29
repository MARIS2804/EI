package marsrover;

public class RightCommand implements Command {
    private MarsRover rover;
    public RightCommand(MarsRover rover) { this.rover = rover; }
    public void execute() { rover.turnRight(); }
}