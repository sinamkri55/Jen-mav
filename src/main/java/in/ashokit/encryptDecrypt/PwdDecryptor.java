package in.ashokit.encryptDecrypt;

import java.util.Base64;
import java.util.Base64.Decoder;

public class PwdDecryptor {
	
	public static String decode(String encodedPwd) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedPwd);
		return new String(decode);
	}

}
