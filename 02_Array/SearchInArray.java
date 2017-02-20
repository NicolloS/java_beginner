/**
 * Find a given element k in an integer array and return its index, return -1 if
 * there is none. [1,2,3,4,5] k=2 answer=1; k=6 answer = -1;
 */
public class SearchInArray {
	public static void main(String[] arr) {
		int[] array1 = new int[] { 100, -22, 43, 14, 11, 55, 101, 202, 101 };
		SearchInArray searchArr = new SearchInArray();
		System.out.println(searchArr.search(array1, 14));
		System.out.println(searchArr.search(array1, 12));
		System.out.println(searchArr.search(array1, -43));
		System.out.println(searchArr.search(array1, 100));
		System.out.println(searchArr.search(array1, 101)); // dvoinoi otvet
															// 6,8??
	}
	
	public String search(int[] arr, int k) {
		String answer1 = "-1", answerOff = "";
		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i])
				if (answerOff.length() > 0)
					answerOff = answerOff + ", " + i;
				else answerOff = answerOff + i;
		}
		if (answerOff.length() == 0)
			return answer1;
		else
			return answerOff;
	}
}
