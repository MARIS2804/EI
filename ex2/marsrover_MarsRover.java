package marsrover;

import java.util.logging.Logger;

public class MarsRover {
    private static final Logger logger = Logger.getLogger(MarsRover.class.getName());
    private int x, y;
    private Direction direction;
    private Grid grid;

    public MarsRover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() throws Exception {
        int[] next = direction.move(x, y);
        if (!grid.isWithinBounds(next[0], next[1])) {
            logger.warning("Attempted to move out of bounds.");
            throw new Exception("Out of bounds!");
        }
        if (grid.isObstacle(next[0], next[1])) {
            logger.warning("Obstacle detected at (" + next[0] + "," + next[1] + ")");
            throw new Exception("Obstacle detected!");
        }
        x = next[0];
        y = next[1];
        logger.info("Moved to (" + x + "," + y + ")");
    }

    public void turnLeft() { direction = direction.left(); }
    public void turnRight() { direction = direction.right(); }
    public String statusReport() {
        return String.format("Rover at (%d,%d) facing %s", x, y, direction);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Direction getDirection() { return direction; }
}