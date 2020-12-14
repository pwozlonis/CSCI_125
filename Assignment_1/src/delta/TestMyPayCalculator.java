package delta;

public class TestMyPayCalculator {

	public static void main(string[] args) {
		
		RegularPay ob1 = new RegularPay(15.0);
		double basicPayment = ob1.computepay(40);
		System.out.println("Base pay is"+basicPayment);
		
		HazardPay ob2 = new HazardPay(15.0);
		double hazardPayment = ob2.computepay(40);
		System.out.println("Hazard pay is"+hazardPayment); 
		
		//change regular pay rate
		
		ob1.setPayRate(17.0);
		basicPayment = ob1.computepay(17.0);
		System.out.println("New base pay is now"+basicPayment);
	}
}
