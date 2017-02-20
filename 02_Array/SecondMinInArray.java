/**
 * Find second minimum number in an integer array. [5,2,7,3,0,-1,9] ans=0;
 */
public class SecondMinInArray {
	public static void main(String[] arr) {
		SecondMinInArray secMin = new SecondMinInArray();
		int[] array1 = new int[] { 100, -22, 43, 14, 11, 55, 101, 202, 101 };
		System.out.println("second minimum = "+secMin.secondMin(array1));
	}

	public int secondMin(int[] arr) {
		int nextMin = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (min < nextMin)
				if ((nextMin > arr[i])&&(arr[i]>min))
					nextMin = arr[i];
		}
		return nextMin;
	}
}
