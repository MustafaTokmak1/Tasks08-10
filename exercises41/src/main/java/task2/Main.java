package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        Walls walls = new Walls();
        Room room1 = new Room(walls,3,5,5);
        Room room2 = new Room(walls,2,3,3);
        Room room3 = new Room(walls,5,4,5);

        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building = new Building(10,4,true,rooms);

        building.oddBuilding();
        building.totalLamps();
        System.out.println(building);
        System.out.println("This building has " + building.totalLamps() + " lamps.");




    }
}
