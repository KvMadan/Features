package in.km.practice;

/**
 * @author Madan Kavarthapu
 *
 */
public class RemoveWhiteSpaces {
	
	public static void removeWhiteSpaces(String inputString) {
		System.out.println(inputString.replaceAll("\\s+", ""));
	}
	
	public static void main(String[] args) {
		
		removeWhiteSpaces("   Madan Kavarthapu   ");
	}

}
