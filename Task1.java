package pgo7;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

}

class Room {
	private String info;
	private List<Furniture> list;
	
	public Room(String info) {
		list = new ArrayList<Furniture>();
		this.info = info;
	}
	
	public double getTotalPrice() {
		double price = 0;
		
		for(Furniture f : list)
			price += f.getFullPrice();
		
		return price;
	}
	
	
}

class Furniture {
	private String name;
	private double cost;
	
	private static double VAT = 0.5;

	public Furniture(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
	public double getPrice() {
		return cost;
	}
	
	public double getFullPrice() {
		return getPrice() + getPrice() * getVAT();
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public static double getVAT() {
		return VAT;
	}
	
	
}