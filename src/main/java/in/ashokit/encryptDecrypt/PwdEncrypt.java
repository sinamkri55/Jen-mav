package in.ashokit.encryptDecrypt;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdEncrypt {
	
	public static String encode(String pwd) {
		//int a=10;
		Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(pwd.getBytes());
		
		return encodedString;
		
		
		
	}

}
