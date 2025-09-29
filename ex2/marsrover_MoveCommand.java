package marsrover;

public class MoveCommand implements Command {
    private MarsRover rover;
    public MoveCommand(MarsRover rover) { this.rover = rover; }
    public void execute() throws Exception { rover.move(); }
}