/**
 * 
 */
package in.km.practice;

/**
 * @author Madan Kavarthapu
 *
 */
public class ReplaceChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String token = "Bangalore";
		int i=0;
		
		for (i=0;i<token.length();i++) {
			if (token.charAt(i) == 'a')
				System.out.print("e");	
			else
				System.out.print(token.charAt(i));
				
		}

	}

}
