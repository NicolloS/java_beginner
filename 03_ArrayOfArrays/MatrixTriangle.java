import java.util.Arrays;
import java.util.Scanner;

/*
 * Given a number n. Initialize and print triangular matrix that looks like
 * this: 
 * [1, 2, 3, 4, ..., n] 
 * [2, 3, 4, ..., n] 
 * [3, 4, ..., n] 
 * ... 
 * [(n-1), n]
 * [n]
 */
public class MatrixTriangle {
	public static void main(String[] arr) {
		MatrixTriangle matrix = new MatrixTriangle();
		int n = 10;
		int[][] array = matrix.matrixTri(n);
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

	public int[][] matrixTri(int n) {
		int[][] arr = new int[n][];
		for (int i = 0; i < n; i++) {
			int[] arrN = new int[n - i];
			for (int j = 0; j < n - i; j++) {
				arrN[j] = i + 1 + j;
			}
			arr[i] = arrN;
		}
		return arr;
	}
}
