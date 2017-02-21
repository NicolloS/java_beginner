/**
 * Reverse an array of integers.
 *
 * E.g. [1,2,3,4,5] is given, [5,4,3,2,1] should be returned.
 */
public class ReverseArray {
	public static void main(String[] arr) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int[] array1 = new int[] { 100, -22, 43, 14, 11, 55, 101, 202 };
		ReverseArray revArr = new ReverseArray();

		int[] arrayRev = revArr.reverseArrInt(array);
		System.out.println("исходный массив");
		revArr.print(array);
		System.out.println("получившийся массив");
		revArr.print(arrayRev);
		revArr.reverseArrVoid(array1);
		revArr.print(array1);
		revArr.reverseArrVoid(array);
		revArr.print(array);
	}

	public void print(int[] array) {
		System.out.print("[" + array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println("]");
	}

	// dopisat' mass
	public int[] reverseArrInt(int[] arr) {
		int[] arr2 = arr;
		int j = 0;
		for (int i = arr.length; j <arr.length; i--,j++) {
			arr2[j] = arr[i]; //rugaetsya :-(
			
		}
		return arr2;
	}

	public void reverseArrVoid(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				int byf;
				byf = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = byf;
			}

		}
	}
}
