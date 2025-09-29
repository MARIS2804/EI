package marsrover;

public class East extends Direction {
    public Direction left() { return new North(); }
    public Direction right() { return new South(); }
    public int[] move(int x, int y) { return new int[]{x+1, y}; }
    public String toString() { return "E"; }
}