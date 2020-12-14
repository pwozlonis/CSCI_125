package delta;

public class TestDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BulkDiscount ob1 = new BulkDiscount(10,20.0);
		double actualDiscount = ob1.computeDiscount(100, 20.0);
		System.out.println("10 items each item is 20$");
		System.out.println("Discount will be "+actualDiscount);
	}

}
