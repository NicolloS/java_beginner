/**
 * Reverse an array of integers.
 *
 * E.g. [1,2,3,4,5] is given, [5,4,3,2,1] should be returned.
 */
public class ReverseArray {
	public static void main(String[] arr) {
		int[] array = new int[] { 1, 2, 3, 4, 5,6 };
		int[] array1 = new int[] { 100, -22, 43, 14, 11, 55, 101, 202 };
		ReverseArray revArr = new ReverseArray();
		revArr.print(array);
		int[] arrayRev = revArr.reverseArrIntBuff(array);
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
	// [13,45,56,9,14,-4,67,0,-7]
	public int[] reverseArrInt(int[] arr) {
		int[] arr2 = new int[arr.length];
		int j = 0;
		for (int i = arr.length-1; j <arr.length; i--,j++) {
			//i = 8; j = 0; arr[i] = -7 ;arr2[j] = 13 => -7;
			//i = 7; j = 1; arr[i] = 0; arr2[j] = 45 =>0; 
			//i = 6; j = 2; arr[i] = 67; arr2[j] = 56 =>67;
			//i = 5; j = 3; arr[i] = -4; arr2[j] = 9 =>-4;
			//i = 4; j = 4; arr[i] = 14; arr2[j] = 14 =>14;
			//i = 3; j = 5; arr[i] = 9; arr2[j] = -4 =>9;
			//i = 2; j = 6; arr[i] = 56; arr2[j] = 67 =>0;
			//i = 1; j = 7; arr[i] = ; arr2[j] = 0 =>0;
			//i = 0; j = 8; arr[i] = 0; arr2[j] = -7 =>0;
			//i = arr.length-j;
			arr2[j] = arr[i]; //rugaetsya :-(
			
		}
		return arr2;
	}
	public int[] reverseArrIntBuff(int[] arr) {
		int j = 0,buff;
		for (int i = arr.length-1; j <arr.length/2; i--,j++) {
			buff = arr[j];
			arr[j] = arr[i];
			arr[i] = buff;
		}
		return arr;
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
