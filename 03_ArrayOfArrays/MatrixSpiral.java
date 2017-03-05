import java.util.Arrays;
import java.util.Scanner;

/*
 * Given a number n &gt; 0. Create a matrix nxn and fill it in with numbers from
 * 1 to nxn as a spiral like the following. E.g. for n = 5, the matrix would
 * look like 
 * [ 1  2  3  4 5] 
 * [16 17 18 19 6] 
 * [15 24 25 20 7] 
 * [14 23 22 21 8] 
 * [13 12 11 10 9]
 */
public class MatrixSpiral {
	public static void main(String[] arr) {
		MatrixSpiral matSpi = new MatrixSpiral();
		System.out.println("********** Console input **********");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter size (nxn) n: ");
			int arraySize = scanner.nextInt();

			int[][] inputData = new int[arraySize][arraySize];
			System.out.println("Enter array:");
			inputData = matSpi.arraySpiralVvod(arraySize);
			System.out.println("**********  Input Array  **********");
			for (int[] is : inputData) {
				System.out.println(Arrays.toString(is));
			}
		}
	}

	public int[][] arraySpiralVvod(int n) {
		int[][] array = new int[n][n];
		int tic = 1;
		for (int a = 0; a <= array.length / 2; a++) {
			for (int j = 0 + a, i = 0 + a; (tic <= n * n) && (i <= n - 1 - a); tic++) {
				array[i][j] = tic;
				if (j < n - 1 - a) {
					j++; 
				} else {
					if (i <= n - 1 - a) {
						i++; 
					}
				}
			}
			for (int j = n - 2 - a, i = n - 1 - a; (tic <= n * n) && (i > a); tic++) {
				array[i][j] = tic;
				if (j > a) {
					j--;
				} else {
					if (i >= a) {
						i--;
					}
				}
			}
		}
		return array;
	}
}
