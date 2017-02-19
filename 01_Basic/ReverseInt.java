/**
 * Reverse an integer.
 *
 * E.g. 12345 is given. 54321 should be returned. (c = a%b) c - ostatok ot /;
 */
public class ReverseInt {
	public static void main(String[] arr) {
		ReverseInt num = new ReverseInt();
		System.out.println(num.reverse(12345));
		System.out.println(num.reverse(123456789));
		System.out.println(num.reverse(1000));
		System.out.println(num.reverse(-100019));
		System.out.println(num.reverse(Integer.MAX_VALUE/10));
	}

	public int reverse(int a) {
		int newA = 0, c;
		if (a < 0) {
			a = -a;
			while (a > 0) {
				c = a % 10;
				newA = newA * 10 + c;
				a = a / 10;
			}
			newA=-newA;
		} else
			while (a > 0) {
				c = a % 10;
				newA = newA * 10 + c;
				a = a / 10;
			}

		return newA;
	}
}
