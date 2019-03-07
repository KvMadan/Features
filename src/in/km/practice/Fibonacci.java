/**
 * 
 */
package in.km.practice;

/**
 * @author Madan Kavarthapu
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 30;
		int i;

		for (i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
	public static int fibo(int number) {
		
		if (number  == 1 || number ==2) {
			return 1;
		}
		return fibo(number-1) + fibo(number-2);		
	}

}
