import java.util.Random;

public class StringToArray {
	private String templateString = "12345";
	private int[] arr;
	private int[][] arrzamas;
	
	public static void main(String[] args) {
		StringToArray theApp = new StringToArray();
		theApp.runTheApp();
		System.out.println("max of three = ");
		System.out.println(theApp.maxofthree(3, 5, 6));
		theApp.inzamas();
	}

	public void runTheApp() {
		arr = new int[templateString.length()];
		for (int i = 0; i < arr.length; i++) {
			char ch = templateString.charAt(i);
			String s = String.valueOf(ch);  
			arr[i] = Integer.parseInt(s);
			
		}
		
		for (int i : arr) {
			System.out.println(i);
			
		}
		
	}
	
	public int maxofthree(int a,int b,int c){
		if (a>b){
			if (a>c) return a;
			else return c;
		}
		else if (b>c) return b;
		else return c;
	}
	public void inzamas () {
		Random ran = new Random(System.currentTimeMillis());
		arrzamas = new int [6][7];
		for (int i = 0; i < arrzamas.length; i++) {
			for (int j = 0; j < arrzamas[i].length; j++) {
				arrzamas[i][j] = ran.nextInt(100);
			}
			
		}
		for (int[] ar : arrzamas) {
			for (int i : ar) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	
}