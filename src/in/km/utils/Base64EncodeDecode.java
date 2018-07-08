/**
 * 
 */
package in.km.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Madan Kavarthapu
 *
 */
public class Base64EncodeDecode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = "Madan:Ramya";
		String encodedString = encoder.encodeToString( 
		        normalString.getBytes(StandardCharsets.UTF_8) );
		
		System.out.println(encodedString);

	}

}
