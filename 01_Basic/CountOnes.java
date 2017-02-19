/**
 * Given an integer number. Count ones in binary representation.
 *
 * E.g. countOne(5) should return 2, since 5 is 101 in binary.
 */
public class CountOnes {
	public static void main(String[] arr) {
		CountOnes num = new CountOnes();
		System.out.println(num.countOnes(5));
		System.out.println(num.countOnes(8));
		System.out.println(num.countOnes(64));
		System.out.println(num.countOnes(12345));
		System.out.println(num.countOnes(15));
		System.out.println(num.countOnes(-15));
		System.out.println(num.countOnes(Integer.MAX_VALUE));
	}

	public int countOnes(int a) {
		int sum = 0, c;
		if (a < 0) {
			a = -a;
			sum++;
		}
		while (a > 0) {
			c = a % 2;
			a = a / 2;
			if (c == 1)
				sum = sum + 1;

		}
		return sum;
	}
}
