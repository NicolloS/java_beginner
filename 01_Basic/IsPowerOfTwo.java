/**
 * Check if given number is a power of 2.
 *
 * E.g. 1=2^0, 2=2^1, 4=2^2, 8=2^3, 16=2^4, ...
 */
public class IsPowerOfTwo {

	public static void main(String[] arr) {
		IsPowerOfTwo num = new IsPowerOfTwo();
		System.out.println(num.isPowerOfTwo(5));
		System.out.println(num.isPowerOfTwo(8));
		System.out.println(num.isPowerOfTwo(64));
		System.out.println(num.isPowerOfTwo(12345));
		System.out.println(num.isPowerOfTwo(Integer.MAX_VALUE));
		System.out.println(num.isPowerOfTwo(-12345));
	}

	public boolean isPowerOfTwo(int a) {
		int c = 0;
		if (a<0) {return false;}
		while (a > 1) {
			c = a % 2;
			a = a / 2;
			if (c != 0) {return false;}

		}
		return true;
	}
}
