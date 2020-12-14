package delta;

public abstract class PayCalculator {

	private double payRate;
	
	public double computepay(double hours) {
		return hours*payRate;
	}
	public PayCalculator(double theRate)  {
		payRate=theRate;
	}
	public double computeRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
}