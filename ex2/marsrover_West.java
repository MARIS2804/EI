package marsrover;

public class West extends Direction {
    public Direction left() { return new South(); }
    public Direction right() { return new North(); }
    public int[] move(int x, int y) { return new int[]{x-1, y}; }
    public String toString() { return "W"; }
}