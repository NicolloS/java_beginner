import java.sql.Array;

/**
 * Find minimum in an integer array and return its index.
 */
public class MinInArray {
	public static void main(String[] arr) {
		MinInArray minArr = new MinInArray();
		int[] array = new int[] { 5, 6, 15, 2, 4 };
		System.out.println(minArr.min(array));
		System.out.println(minArr.min(new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, 15, 2, 4 }));
		System.out.println(minArr.min(new int [] {0,1,-1,-5,5}));
		
	}

	public int min(int[] arr) {
		int minOfArr = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minOfArr > arr[i]){
				minOfArr = arr[i];
			}
		}
		return minOfArr;
	}
}
