package com.skilldistillery.foodtrucks;

public class FoodTrucks {
	
	
	private FoodTruck[] foodTrucks;
	private int numTrucks = 0;
	
	private static final int MAX_TRUCKS = 5;
	
	public FoodTrucks() {
		foodTrucks = new FoodTruck[MAX_TRUCKS];
	}
	
	public void addTruck(FoodTrucks f) {
		foodTrucks[numTrucks] = f;
		numTrucks++;
	}
	
	public FoodTrucks[] getFoodTrucks() {
		FoodTrucks[] trucksCopy;
		trucksCopy = new FoodTrucks[numTrucks];
		for(int i = 0; i < numTrucks; i++) {
			trucksCopy[i] = foodTrucks[i];
		}
		return trucksCopy;
	}
}
