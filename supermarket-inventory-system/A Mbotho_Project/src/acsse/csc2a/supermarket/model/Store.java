package acsse.csc2a.supermarket.model;

import java.util.ArrayList;

public class Store {
	
	private ArrayList<Food> StoreFood=new ArrayList<>();
      


	public ArrayList<Food> getStoreFood() {
		return StoreFood;
	}

	public void setStoreFood(ArrayList<Food> storeFood) {
		StoreFood = storeFood;
	}
	
	public void AddFood(Food MyFood)
	{
		this.StoreFood.add(MyFood);
		
		
	}
	
	public Food getFood()
	{
		Food MyFood = null;
		
		
		
		MyFood = StoreFood.getFirst();
		
		
		
		return MyFood;	
		
	}
	
	
	

}
