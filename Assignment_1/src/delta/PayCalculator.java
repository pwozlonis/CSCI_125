package delta;

public abstract class PayCalculator {

BigDecimal payRate;
	
	public PayCalculator(BigDecimal payRate) {
		this.payRate = payRate;
	}
	public abstract BigDecimal computePay(float hour);

}