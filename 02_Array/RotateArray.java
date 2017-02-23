/*
 * Rotate the array A by K positions.
 *
 * E.g.
 * A : [1 2 3 4 5 6]
 * K : 1
 * K2 :3
 *
 * The output :
 * [2 3 4 5 6 1]
 * [4 5 6 3 2 1] // [4 5 6 1 2 3]??
 */
public class RotateArray {
	public static void main(String[] arr) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6 };
		RotateArray rotArr = new RotateArray();
		ReverseArray revArr = new ReverseArray();
		revArr.print(array);
		rotArr.rotate(array);
		revArr.print(array);
		rotArr.rotateN(array1,3);
		revArr.print(array1);
	}

	public int[] rotate(int[] arr) {
		int buf;
		for (int i = 0; i < arr.length - 1; i++) {
			buf = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = buf;
		}
		return arr;
	}

	public int[] rotateN(int[] arr, int n) {
		int buf;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				buf = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = buf;
			}
		}
		return arr;
	}
}
