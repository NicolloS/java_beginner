import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a matrix of m*n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 *
 * <pre>
 * Example:
 * Given the following matrix:
 * <code>
 * [
 *   [ 1, 2, 3 ],
 *   [ 4, 5, 6 ],
 *   [ 7, 8, 9 ]
 * ]
 * </code>
 * You should return <code>[1, 2, 3, 6, 9, 8, 7, 4, 5]</code>
 * </pre>
 * 
 * <pre><code>
 * [1,2,3]
 * [4,5,6]
 * [7,8,9]
 * [1,2,3]
 * [4,5,6]
 * </code></pre>
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
		for (int sloj = 0; sloj <= array.length / 2; sloj++) {
			// po stroke =>
			for (int j = sloj, i = sloj; j < n - 1 - sloj; j++) {
				array[i][j] = tic;
				tic++;
			}
			// po stolbcy vniz
			for (int j = n - 1 - sloj, i = sloj; i <= n - 1 - sloj; i++) {
				array[i][j] = tic;
				tic++;
			}
			// po stroke <=
			for (int j = n - 2 - sloj, i = n - 1 - sloj; j > sloj; j--) {
				array[i][j] = tic;
				tic++;
			}
			// po stolbcy vverx
			for (int j = sloj, i = n - 1 - sloj; i > sloj; i--) {
				array[i][j] = tic;
				tic++;
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
		for (int sloj = 0; sloj <= max; sloj++) {
			// po stroke =>
			for (int j = sloj, i = sloj; j < n - 1 - sloj; j++) {
				array[i][j] = tic;
				tic++;
			}
			// po stolbcy vniz
			for (int j = n - 1 - sloj, i = sloj; i <= n - 1 - sloj; i++) {
				array[i][j] = tic;
				tic++;
			}
			// po stroke <=
			for (int j = n - 2 - sloj, i = n - 1 - sloj; j > sloj; j--) {
				array[i][j] = tic;
				tic++;
			}
			// po stolbcy vverx
			for (int j = sloj, i = n - 1 - sloj; i > sloj; i--) {
				array[i][j] = tic;
				tic++;
			}
		}

		return arr;
	}
}
