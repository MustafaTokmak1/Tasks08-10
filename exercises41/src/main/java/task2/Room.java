package task2;

public class Room {
    private Walls walls;
    private int numberOfDoors;
    private int numberOfLambs;
    private int numberOfWindows;

    public Room(Walls walls, int numberOfDoors, int numberOfLambs, int numberOfWindows) {
        this.walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLambs = numberOfLambs;
        this.numberOfWindows = numberOfWindows;
    }

    public Walls getWalls() {
        return walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLambs() {
        return numberOfLambs;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    @Override
    public String toString() {
        return "Room"
                 + "walls" +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfLambs=" + numberOfLambs +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }
}
