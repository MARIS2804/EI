package marsrover;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.addObstacle(new Obstacle(2, 2));
        grid.addObstacle(new Obstacle(3, 5));

        MarsRover rover = new MarsRover(0, 0, new North(), grid);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        logger.info("Mars Rover started.");
        System.out.println("Mars Rover Control (type EXIT to quit)");

        while (running) {
            try {
                System.out.print("Enter command (M/L/R/STATUS): ");
                String input = scanner.nextLine().trim().toUpperCase();

                switch (input) {
                    case "M":
                        new MoveCommand(rover).execute();
                        break;
                    case "L":
                        new LeftCommand(rover).execute();
                        break;
                    case "R":
                        new RightCommand(rover).execute();
                        break;
                    case "STATUS":
                        System.out.println(rover.statusReport());
                        break;
                    case "EXIT":
                        running = false;
                        break;
                    default:
                        System.out.println("Unknown command.");
                }
            } catch (Exception e) {
                logger.severe("Error: " + e.getMessage());
                System.out.println("Error: " + e.getMessage());
            }
        }
        logger.info("Mars Rover terminated.");
    }
}