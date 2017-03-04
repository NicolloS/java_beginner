/**
 * Find minimum in an integer array and return its index.
 */
public class MinInArray {
	public static void main(String[] arr) {
		MinInArray minArr = new MinInArray();
		int[] array = new int[] { 5, 6, 15, 2, 4 };
		int[] array1 = new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE, 15, 2, 4 };
		int[] array2 = new int[] { 0, 1, -1, -5, 5 };
		System.out.println("Find minimum in an integer array and return its index.");
		minArr.printTestArray(array);
		minArr.printTestArray(array1);
		minArr.printTestArray(array2);
	}

	public void printTestArray(int[] array) {
		MinInArray minArr = new MinInArray();
		ReverseArray revArr = new ReverseArray();
		revArr.print(array);
		System.out.println("index min =" + minArr.minIndex(array) + "  value min =" + minArr.minValue(array));
	}

	public int minIndex(int[] arr) {
		int minOfArr = arr[0], index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (minOfArr > arr[i]) {
				minOfArr = arr[i];
				index = i;
			}
		}
		return index;
	}

	public int minValue(int[] arr) {
		int minOfArr = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minOfArr > arr[i]) {
				minOfArr = arr[i];
			}
		}
		return minOfArr;
	}
}
