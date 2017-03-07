import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a matrix of m*n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 *
 * Example: Given the following matrix: [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ]
 * ] You should return [1, 2, 3, 6, 9, 8, 7, 4, 5]
 * 
 * [1,2,3]
 * [4,5,6]
 * [7,8,9]
 * [1,2,3]
 * [4,5,6]
 * 
 */

public class MatrixSpiral2 {
	public static void main(String[] arr) {
		MatrixSpiral2 matSpi2 = new MatrixSpiral2();
		int n = 0, m = 0;
		System.out.println("********** Console input **********");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter size (nxm) n: ");
			int arraySizeN = scanner.nextInt();
			System.out.print("Enter size (nxm) m: ");
			int arraySizeM = scanner.nextInt();
			System.out.println("Enter array:");
			int[][] inputData = new int[arraySizeN][arraySizeM];
			for (int i = 0; i < arraySizeN; i++) {
				for (int j = 0; j < arraySizeM; j++) {
					inputData[i][j] = scanner.nextInt();
				}
			}
			// inputData = matSpi2.arraySpiralVvod(arraySizeN,arraySizeM);

			// for (int[] is : inputData) {
			// System.out.println(Arrays.toString(is));
			// }
			System.out.println("**********  Input Array  **********");
			for (int[] is : inputData) {
				System.out.println(Arrays.toString(is));
			}
			int[] resultArray = matSpi2.arraySpiralOutput(inputData, n, m);
			System.out.println(Arrays.toString(resultArray));
		}
	}

	public int[][] arraySpiralVvod(int n, int m) {
		int[][] array = new int[n][m];
		int tic = 1;
		for (int a = 0; a <= array.length / 2; a++) {
			for (int j = 0 + a, i = 0 + a; (tic <= n * m) && (i <= n - 1 - a); tic++) {
				array[i][j] = tic;
				if (j < m - 1 - a) {
					j++;
				} else {
					if (i <= n - 1 - a) {
						i++;
					}
				}
			}
			for (int j = m - 2 - a, i = n - 1 - a; (tic <= n * m) && (i > a); tic++) {
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

	public int[] arraySpiralOutput(int[][] array, int n, int m) {
		int[] arr = new int[n * m];
		//int[] arr = new int[array.length*array[n].length ];
		int max, tic = 0;
		if (m / 2 < n / 2)
			max = n / 2;
		else
			max = m / 2;
		for (int a = 0; a <= max; a++) {
			for (int j = 0 + a, i = 0 + a;(tic <= n * m) && ( i <= n - 1 - a); tic++) {
				arr[tic] = array[i][j];
				System.out.println(arr[tic]);
				if (j < m - 1 - a) {
					j++;
				} else {
					if (i <= n - 1 - a) {
						i++;
					}
				}
			}
			for (int j = m - 2 - a, i = n - 1 - a; (tic <= n * m) && (i > a); tic++) {
				arr[tic] = array[i][j];
				System.out.println(arr[tic]);
				if (j > a) {
					j--;
				} else {
					if (i >= a) {
						i--;
					}
				}
			}
		}

		return arr;
	}
}
