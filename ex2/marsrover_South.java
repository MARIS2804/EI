package marsrover;

public class South extends Direction {
    public Direction left() { return new East(); }
    public Direction right() { return new West(); }
    public int[] move(int x, int y) { return new int[]{x, y-1}; }
    public String toString() { return "S"; }
}