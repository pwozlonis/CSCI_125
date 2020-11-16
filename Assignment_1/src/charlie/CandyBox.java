package charlie;

public class CandyBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] order1 = {0,0,3,4,7};
		int[] order2 = {0,4,0,1,2};
		int[] c = new int[5]; 
		
		for (int i = 0; i < order1.length; ++i) {
		    c[i] = order1[i] + order2[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
//Java is fun,but eating candy irl is better