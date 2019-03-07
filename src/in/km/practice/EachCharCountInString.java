/**
 * 
 */
package in.km.practice;

import java.util.HashMap;

/**
 * @author Madan Kavarthapu
 *
 */
public class EachCharCountInString {
	
	public static void charCount(String inputString) {
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] strArray = inputString.toCharArray();
		
		for (char c: strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		
		System.out.println(charCountMap);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		charCount("Madan Kavarthapu");		
	}

}
