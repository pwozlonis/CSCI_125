package delta;

public interface MessageEncoder {

	public String encode(String plainText);
	public String decode(String plainText);
} 
