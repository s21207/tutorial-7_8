package pgo7;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

}

class House {
	private List<Room> rooms = new ArrayList<Room>();
	private String address;
	
	private static int numOfRooms;
	
	private House(String address) {
		this.address = address;
		numOfRooms = getRoomCount();
	}
	
	public void addRoom(Room r) {
		rooms.add(r);
	}
	
	public void addRoom(List<Room> rooms) {
		this.rooms.addAll(rooms);
	}
	
	public int getRoomCount() {
		return rooms.size();
	}
}
