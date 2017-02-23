/**
 * Given a non-negative number represented as an array of digits, add 1 to the
 * number (increment the number represented by the digits).
 *
 * The digits are stored such that the most significant digit is at the
 * beginning of the array.
 *
 * Example: Given array [1, 2, 3], the returned array should be [1, 2, 4] as 123
 * + 1 = 124.
 */
public class AddOneToNumber {
	public static void main(String[] arr) {
		int[] array = new int[] { 1, 2, 3 };
		int[] array1 = new int[] { 1, 2, 9 };
		int[] array2 = new int[] { 7, 9, 9 };
		int[] array3 = new int[] { 9, 9, 9, 9 };
		AddOneToNumber addOne = new AddOneToNumber();
		ReverseArray revArr = new ReverseArray();
		revArr.print(addOne.addOne(array));
		revArr.print(addOne.addOne(array1));
		revArr.print(addOne.addOne(array2));
		revArr.print(addOne.addOne(array3));
	}

	public int[] addOne(int[] arr) {
		for (int i = arr.length - 1; i > -1; i--) {
			if (arr[i] + 1 > 9) {
				arr[i] = 0;
			} else {
				arr[i] = arr[i] + 1;
				//break;
			}
		}
		if (arr[0] == 0) {
			int[] arr1 = new int[arr.length + 1];
			arr1[0] = 1;
			for (int i = 1; i < arr1.length; i++) {
				arr1[i] = arr[i - 1];
			}
			return arr1;
		} else {
			return arr;
		}
	}
}
