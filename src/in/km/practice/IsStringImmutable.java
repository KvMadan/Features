/**
 * 
 */
package in.km.practice;

/**
 * @author Madan Kavarthapu
 *
 */
public class IsStringImmutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "Madan";
		String s2 = "Madan";
		
		System.out.println(s1 == s2);
		
		s1 = s1 + "Kv";
		
		System.out.println(s1 == s2);

	}

}
