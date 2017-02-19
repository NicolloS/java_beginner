/**
 * Find a maximum of three given numbers.
 */
public class MaxOfThree {
	public int max(int a, int b, int c) {
		if (a > b) {
			if (a > c)
				return a;
			else
				return c;
		} else if (b > c)
			return b;
		else
			return c;
		//return b>c?b:c;
	}

	public static void main(String[] arr) {
		MaxOfThree maxOfThree = new MaxOfThree();
		System.out.println(maxOfThree.max(1, 2, 3));
		System.out.println(maxOfThree.max(9, 0, -1));
		System.out.println(maxOfThree.max(7, 7, 7));
		System.out.println(maxOfThree.max(-7, -17, -47));
		System.out.println(maxOfThree.max(745345347, Integer.MAX_VALUE, 34534534));
		System.out.println(maxOfThree.max(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
	}
}
