package marsrover;

public class LeftCommand implements Command {
    private MarsRover rover;
    public LeftCommand(MarsRover rover) { this.rover = rover; }
    public void execute() { rover.turnLeft(); }
}