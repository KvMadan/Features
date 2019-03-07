/**
 * 
 */
package in.km.practice;

/**
 * @author Madan Kavarthapu
 *
 */
public class StringReverse {

	public static void reverse(String inputString) {
		StringBuilder sb = new StringBuilder(inputString);
		System.out.println(sb.reverse());
	}

	public static void reversePlain(String inputString) {

		char[] charArray = inputString.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println("\n");
	}

	public static void reverseEachWordofString(String inputString) {
		String[] words = inputString.split(" ");

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		
		System.out.println(inputString);
		System.out.println(reverseString);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reverse("Madan Kavarthapu");

		reversePlain("Ramya Kavarthapu");
		
		reverseEachWordofString("Madan Kavarthapu Ramya Kavarthapu");

	}

}
