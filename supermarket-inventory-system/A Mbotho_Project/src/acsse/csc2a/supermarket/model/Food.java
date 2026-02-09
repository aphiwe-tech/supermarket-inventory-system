package  acsse.csc2a.supermarket.model;


public abstract class Food {
	
	private String Food_Barcode;
	private String Food_Quality;
	public String getFood_Barcode() {
		return Food_Barcode;
	}
	public void setFood_Barcode(String food_Barcode) {
		Food_Barcode = food_Barcode;
	}
	public String getFood_Quality() {
		return Food_Quality;
	}
	public void setFood_Quality(String food_Quality) {
		Food_Quality = food_Quality;
	}
	public Food(String food_Barcode, String food_Quality) {
		super();
		Food_Barcode = food_Barcode;
		Food_Quality = food_Quality;
	}
	@Override
	public String toString() {
		return " Food_Barcode " + Food_Barcode + " Food_Quality " + Food_Quality + " ";
	}
	
	
	

}
