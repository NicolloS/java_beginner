import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a number n. Initialize and print triangular matrix that looks like
 * this: [1, 2, 3, 4, ..., n] [2, 3, 4, ..., n] [3, 4, ..., n] ... [(n-1), n]
 * [n]
 */
public class MatrixTriangle {
	public static void main(String[]){
		MatrixTriangle matrix = MatrixTriangle;
		int n = 6;
		int[][] array = matrix.matrixTri(n) ;
		}
    }

	public int[][] matrixTri(int n) {
		int [][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				a[i][j]=n;
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println("");
	}
		return arr;
}
