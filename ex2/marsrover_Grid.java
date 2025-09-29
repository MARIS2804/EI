package marsrover;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private int width, height;
    private List<Obstacle> obstacles = new ArrayList<>();

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addObstacle(Obstacle obs) {
        obstacles.add(obs);
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public boolean isObstacle(int x, int y) {
        for (Obstacle obs : obstacles) {
            if (obs.isObstacle(x, y)) return true;
        }
        return false;
    }
}