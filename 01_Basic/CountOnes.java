/**
 * Given an integer number. Count ones in binary representation.
 *
 * E.g. countOne(5) should return 2, since 5 is 101 in binary.
 */
public class CountOnes {
	public static void main(String[] arr) {
		CountOnes num = new CountOnes();
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE+1)+" = "+ num.countOnes(5));
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE)+" = "+num.countOnes(8));
		System.out.println(Integer.toBinaryString(1)+" = "+num.countOnes(64));
		System.out.println(Integer.toBinaryString(-1)+" = "+num.countOnes(12345));
		System.out.println(Integer.toBinaryString(15)+" = "+num.countOnes(15));
		System.out.println(Integer.toBinaryString(-15)+" = "+ num.countOnes(15));
		System.out.println(num.countOnes(Integer.MAX_VALUE));
		System.out.println(num.countOnes(Integer.MAX_VALUE - 1));
		System.out.println(num.countOnes(Integer.MIN_VALUE + 1));
		System.out.println(num.countOnes(0));
		System.out.println(num.countOnes(-1));
		System.out.println(num.countOnes(1));
	}

	public int countOnes(int a) {
		int sum = 0, c;
		if (a < 0) {
			sum++; // a =-a;?????
			{
				//if a =-a => a = 1111n => 33-n= -a;
				c = a % 2;
				a = a / 2;
				if ((c == -1) || (c == 1))
					sum++;
			}
			while (a < -1)
				;
		} else
			while (a > 0) {
				c = a % 2;
				a = a / 2;
				if (c == 1)
					sum++;
			}
		return sum;
	}
}
