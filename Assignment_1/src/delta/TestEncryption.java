package delta;

public class TestEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "Table";
		
		SubstitutionCipher ob1 = new SubstitutionCipher(4);
		String encodedString = ob1.encode(value);
		System.out.println("Encoded Value is "+encodedString);
		
		String decodedString = ob1.decode(encodedString);
		System.out.println("Decoded Value is "+encodedString);
		
	}

}
