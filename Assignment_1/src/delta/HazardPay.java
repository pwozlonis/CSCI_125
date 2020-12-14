package delta;

public class HazardPay extends MyPayCalculator {

	public HazardPay(double theRate) {
		super(theRate);
	}
	public double computePay(double hours) {
		return super.computepay(hours)*1.5;
	}
}
