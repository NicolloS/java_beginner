/**
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

	}

	public int[][] arraySpiralVvod(int n) {
		int[][] array = new int[n][n];
		int a,b,c;
		a= array.length;
		for (int i = 0; i < a - 1; i++) {
			for (int j = 0; j < a; j++) {

			} // i j
			/*//j++ i = 0
			 * 1 [0][0]	 	1 
			 * 2 [0][1]		2
			 * 3 [0][2]		3
			 * 4 [0][3]		4
			 * 5 [0][4]		5	///j = length-1=4 i++ //if j=
			 * 6 [1][4]		6
			 * 7 [2][4]
			 * 8 [3][4]
			 * 9 [4][4]			//j-- i =length-1
			 * 10 [4][3]
			 * 11 [4][2]
			 * 12 [4][1]
			 * 13 [4][0]		//j = 0 i--
			 * 14 [3][0]
			 * 15 [2][0]
			 * 16 [1][0]
			 * 17 [1][1]		//j ++  i = 1
			 * 18 [1][2]
			 * 19 [1][3]		//j = length-1-1=3  i++
			 * 20 [2][3]
			 * 21 [3][3]
			 * 22 [3]   
			 */
		}
		return array;
	}

}
