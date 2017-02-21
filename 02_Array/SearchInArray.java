/**
 * Find a given element k in an integer array and return its index, return -1 if
 * there is none. [1,2,3,4,5] k=2 answer=1; k=6 answer = -1;
 */
public class SearchInArray {
	public static void main(String[] arr) {
		int[] array1 = new int[] { 100, -22, 43, 14, 11, 55, 101, 202, 101 };
		SearchInArray searchArr = new SearchInArray();
		ReverseArray revArr = new ReverseArray();
		revArr.print(array1);
		System.out.println("k=14 answer=" + searchArr.search(array1, 14));
		System.out.println("k=12 answer=" + searchArr.search(array1, 12));
		System.out.println("k=-43 answer=" + searchArr.search(array1, -43));
		System.out.println("k=100 answer=" + searchArr.search(array1, 100));
		System.out.println("k=101 answer=" + searchArr.search(array1, 101)); // dvoinoi_otvet_6,8??
	}

	public int search(int[] arr, int k) {
		int answer = -1;
		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i]) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
