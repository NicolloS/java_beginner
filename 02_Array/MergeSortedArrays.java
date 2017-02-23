/**
 * Given a two sorted (ascending) integer arrays A and B. Return array C that is
 * a result of merging A and B (C is also sorted).
 *
 * A = [1,2,3,6,7] B = [2,5,12,13] Result: C = [1,2,2,3,5,6,7,12,13]
 */
public class MergeSortedArrays {
	public static void main(String[] arr) {
		MergeSortedArrays mergeSortedArr = new MergeSortedArrays();
		ReverseArray revArr = new ReverseArray();
		int[] aArr = new int[] { 1, 2, 3, 6, 7 };
		int[] bArr = new int[] { 2, 5, 12, 13 };
		int[] cArr = mergeSortedArr.merge(aArr, bArr);
		revArr.print(aArr);
		revArr.print(bArr);
		revArr.print(cArr);
	}

	public int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int bi = 0;
		int ai = 0;
		for (int i = 0; i < c.length; i++) {
			if (ai < a.length) {
				if (bi < b.length) {
					if (a[ai] < b[bi]) {
					c[i] = a[ai];
					ai++;
				} else {
					c[i] = b[bi];
					bi++;
				}
			}else{c[i] = a[ai];
			ai++;} 
			}else {
				c[i] = b[bi];
				bi++;}
			// if (i < a.length)
			// c[i] = a[i];
			// else
			// c[i] = b[i - a.length];
			// if (a[i]<b[i - a.length])
		}
		return c;
	}
}
