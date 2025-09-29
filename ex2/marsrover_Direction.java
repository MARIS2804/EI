package marsrover;

public abstract class Direction {
    public abstract Direction left();
    public abstract Direction right();
    public abstract int[] move(int x, int y);
    public abstract String toString();
}