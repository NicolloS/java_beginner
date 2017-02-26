import java.util.Arrays;
import java.util.Scanner;

/**
 * Give a n*n square matrix, return an array of its anti-diagonals. Look at the example for more details.
 *
 * Examples:
 * Input:
 * [1, 2, 3]
 * [4, 5, 6]
 * [7, 8, 9]
 *
 * Return the following :
 * [ 
 *   [1],
 *   [2, 4],
 *   [3, 5, 7],
 *   [6, 8],
 *   [9]
 * ]
 *
 * Input:
 * [1, 2]
 * [3, 4]
 *
 * Return the following :
 * [
 *   [1],
 *   [2, 3],
 *   [4]
 * ]
 */
public class AntiDiagonals {
	public static void main	(String[] arr) {
		AntiDiagonals antiDiagonals = new AntiDiagonals();
		int [][] array1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("********** Console input **********");

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter size (nxn) n: ");
			int arraySize = scanner.nextInt();
			int[][] inputData = new int[arraySize][arraySize];
			System.out.println("Enter array:");
			for (int i = 0; i < arraySize; i++) {
				for (int j = 0; j <arraySize; j++) {
				inputData[i][j] = scanner.nextInt();
				}
			}

			System.out.println("**********  Input Array  **********");
			System.out.println(Arrays.toString(inputData));

			// Add one to input array
			int[][] result = antiDiagonals.backDiagon(inputData);

			System.out.println("********** Result Array  **********");
			System.out.println(Arrays.toString(result));
		}
		
	}
	public int[][] backDiagon(int[][] arrayTwo) {
		
		return arrayTwo;
	}
}
