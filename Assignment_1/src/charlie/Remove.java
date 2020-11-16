package charlie;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count = 0;
			
			for(int number: in) {
				if(number == intv) {
					count++;
				}
			}
			
			if(count == 0) {
				return in;
			}
			int[] out = new int[in.length - count];
			int index=0;
			for(int value : in) {
				if (value != intv) {
					out[index] = value;
					index++;
				}
			}
			in = null;
			return out;

	}

}
//I'm lost in the sauce with this HW