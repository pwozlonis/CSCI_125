package delta;

public class SubstitutionCipher implements MessageEncoder {

	int shift;
	
	public SubstitutionCipher(int theShift) {
		shift = theShift;
	}
	
	@Override
	public String encode(String plaintext) {
		String encoded="";
		for(int i=0; i<PlainText.length()i++{
			char x = plainText.charAt(i);
			x = shiftCharacter(x);
			encoded = encoded+x;
		}
		
		return encoded;
	}
	
	@Override
	public String decode(String plainText) {
		String decoded ="";
		for(int i=0; i<PlainText.length();i++{
			char x = plainText.charAt(i);
			x=reverseShiftCharacter(x); 
			decoded=decoded+x;
		}
		
		return decoded;
	}
	
	Character shiftCharacter(Character x) {
		return (char) (x+shift);
	}
	
	Character reverseshiftCharacter(Character x) {
		return (char) (x-shift);
	}
	
}
