package marsrover;

public class Obstacle {
    private int x, y;
    public Obstacle(int x, int y) { this.x = x; this.y = y; }

    public boolean isObstacle(int tx, int ty) { return tx == x && ty == y; }
}