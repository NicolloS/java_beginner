/**
 * Find a maximum of three given numbers.
 */
public class MaxOfThree {
     public int max(int a, int b, int c) {
        // insert your code hede
    	 //public int maxofthree(int a,int b,int c){
    			if (a>b){
    				if (a>c) return a;
    				else return c;
    			}
    			else if (b>c) return b;
    			else return c;
        //return 0;
    }
}
