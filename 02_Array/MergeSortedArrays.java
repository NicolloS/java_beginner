import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a two sorted (ascending) integer arrays A and B.
 * Return sorted array C that is a result of merging A and B.
 *
 * Example:
 *   A = [1,2,3,6,7]
 *   B = [2,5,12,13]
 * Result:
 *   C = [1,2,2,3,5,6,7,12,13]
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

        System.out.println("********** Console input **********");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array A: ");
        int arraySizeA = scanner.nextInt();
        int[] inputDataA = new int[arraySizeA];
        System.out.println("Enter array A:");
        for(int i = 0; i < arraySizeA; i++) {
            inputDataA[i] = scanner.nextInt();
        }
        System.out.print("Enter size of array B: ");
        int arraySizeB = scanner.nextInt();
        int[] inputDataB = new int[arraySizeB];
        System.out.println("Enter array B:");
        for(int i = 0; i < arraySizeB; i++) {
            inputDataB[i] = scanner.nextInt();
        }

        System.out.println("**********  Input Array  **********");
        System.out.println("A = " + Arrays.toString(inputDataA));
        System.out.println("B = " + Arrays.toString(inputDataB));

        // Add one to input array
        int[] result = mergeSortedArr.merge(inputDataA, inputDataB);

        System.out.println("********** Result Array  **********");
        System.out.println(Arrays.toString(result));
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
