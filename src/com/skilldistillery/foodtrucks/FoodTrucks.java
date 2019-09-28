package com.skilldistillery.foodtrucks;

public class FoodTrucks extends FoodTruck{
	
	
	private FoodTruck[] foodTrucks;
	private int numTrucks = 0;
	private int hiRated = 0;
	
	private static final int MAX_TRUCKS = 5;
	
	public FoodTrucks() {
		foodTrucks = new FoodTruck[MAX_TRUCKS];
	}
	
	public void addTruck(FoodTruck f) {
		foodTrucks[numTrucks] = f;
		numTrucks++;
	}
	
	public void calculateAvg(int rate) {
		
	}
	
	public FoodTruck[] getFoodTrucks() {
		FoodTruck[] trucksCopy;
		trucksCopy = new FoodTruck[numTrucks];
		for(int i = 0; i < numTrucks; i++) {
			trucksCopy[i] = foodTrucks[i];
		}
		return trucksCopy;
	}
	
}
