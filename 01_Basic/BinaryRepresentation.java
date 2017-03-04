import java.util.Scanner;

/**
 * Binary Representation.
 *
 * Given an integer number, find its representation in binary. And vice versa,
 * given a binary integer, find its representation in decimal.
 */
public class BinaryRepresentation {
	public static void main(String[] arr) {
		BinaryRepresentation binary = new BinaryRepresentation();

		System.out.println("********** Console input int **********");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter int:");
			int inputDataInt = scanner.nextInt();
			String resultStr = binary.toBinary(inputDataInt);
			System.out.println("********** Result **********");
			System.out.println(resultStr);
			System.out.println("********** Console input bin**********");
			String inputDataStr = scanner.next();
			int result = binary.toDecimal(inputDataStr);
			System.out.println("********** Result **********");
			System.out.println(result);
		}
	}

	public String toBinary(int a) {
		String strBin = "";
		int c;
		if (a == 0)
			strBin = "0";
		if (a < 0)
			throw new RuntimeException("it's negative");

		while (a >= 1) {
			c = a % 2;
			if (c == 1)
				strBin = "1" + strBin;
			else
				strBin = "0" + strBin;
			a = a / 2;
		}
		// StringBuilder strBuild = new StringBuilder(strBin);
		// strBin = strBuild.reverse().toString();
		return strBin; // reverse
	}

	public int toDecimal(String a) {
		int decimalString = 0, powerOf2 = 1;
		for (int i = a.length() - 1; i >= 0; i--) {
			// decimalString = decimalString +
			// Integer.parseInt(String.valueOf(a.charAt(i))) * powerOf2;
			if (a.charAt(i) == '1')
				decimalString = decimalString + powerOf2;
			powerOf2 = powerOf2 * 2;
		}
		return decimalString;
	}
}
