package acsse.csc2a.supermarket.model;

public class FrozenFood extends Food {

	public FrozenFood(String food_Barcode, String food_Quality, EDietType diettt, int TempreturFood ) {
		super(food_Barcode, food_Quality);
		// TODO Auto-generated constructor stub
		//	FrozenFood myFrozen = new FrozenFood(Canned_BARCODE,Canned_Quality,FROZENFOOD_DIET,FROZENFOOD_TEMPERATURE);
		this.diet = diettt;
		this.FrozenFood_Tempreture = TempreturFood;
		
	}
	
	private int FrozenFood_Tempreture;
	private EDietType diet;
	@Override
	public String toString() {
		return super.toString() + "FrozenFood [FrozenFood_Tempreture=" + FrozenFood_Tempreture + ", diet=" + diet + "]";
	}
	
	
	
	
	
	
    
}
