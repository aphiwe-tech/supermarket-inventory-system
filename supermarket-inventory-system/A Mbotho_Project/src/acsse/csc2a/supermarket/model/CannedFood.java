package acsse.csc2a.supermarket.model;

public class CannedFood extends Food{
	
	public CannedFood(String food_Barcode, String food_Quality, double CannedFood_Weights) {
		super(food_Barcode, food_Quality);
		// TODO Auto-generated constructor stub
		this.CannedFood_Weight = CannedFood_Weights;
		
	}

	private double CannedFood_Weight;

	public double getCannedFood_Weight() {
		return CannedFood_Weight;
	}

	public void setCannedFood_Weight(double cannedFood_Weight) {
		CannedFood_Weight = cannedFood_Weight;
	}

	@Override
	public String toString() {
		return super.toString() + "CannedFood [CannedFood_Weight=" + CannedFood_Weight + "]";
	}
   
	
	
	

}
