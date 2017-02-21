/**
 * Find second minimum number in an integer array. [5,2,7,3,0,-1,9] ans=0;
 */
public class SecondMinInArray {
	public static void main(String[] arr) {
		SecondMinInArray secMin = new SecondMinInArray();
		ReverseArray revArr = new ReverseArray();
		int[] array1 = new int[] { 100, -22, 43, 14, 11, 55, 101, 202, 101 };
		int[] array2 = new int[] { -2, 2, 2 };
		int[] array3 = new int[] { 100 };
		int[] array4 = new int[] { 5, 2, 7, 3, 0, -1, 9 };
		System.out.println("Find second minimum number in an integer array. [5,2,7,3,0,-1,9] ans=0;");
		revArr.print(array4);
		System.out.println("second minimum = " + secMin.secondMin(array4));
		revArr.print(array1);
		System.out.println("second minimum = " + secMin.secondMin(array1));
		revArr.print(array2);
		System.out.println("second minimum = " + secMin.secondMin(array2));
		revArr.print(array3);
		System.out.println("second minimum = " + secMin.secondMin(array3));
	}

	public int secondMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int nextMin = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if ((min == arr[0]) && (arr.length >= 2)) {
				nextMin = arr[1];
			}
			if (min < nextMin) {
				if ((nextMin > arr[i]) && (arr[i] > min)) {
					nextMin = arr[i];
				}
			}
		}
		return nextMin;
	}
}
