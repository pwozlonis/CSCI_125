package delta;

public class BulkDiscount extends DiscountPolicy{
	
	private double percent;
	private int minimum ;
	
	public BulkDiscount(int min, double per) {
	 minimum = min;
	 percent = per;
	}
	
	@Override
	public double computeDiscount(int count, double itemCost) {

		double discount = 0; 
		if (count > minimum){
			discount = count*itemCost*percent/100;
		}
		return discount;
	}
}