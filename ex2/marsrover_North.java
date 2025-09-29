package marsrover;

public class North extends Direction {
    public Direction left() { return new West(); }
    public Direction right() { return new East(); }
    public int[] move(int x, int y) { return new int[]{x, y+1}; }
    public String toString() { return "N"; }
}