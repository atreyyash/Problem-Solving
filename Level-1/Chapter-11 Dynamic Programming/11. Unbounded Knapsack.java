/*Unbounded Knapsack*/

	import java.io.*;
	import java.util.*;

	public class Main {

	public static void main(String[] args) throws Exception {
	    Scanner s = new Scanner(System.in);
	    
	    int n = s.nextInt();
	    
	    int[] vals = new int[n];
	    for(int i=0;i<n;i++){
	        vals[i] = s.nextInt();
	    }
	    
	    int[] wts = new int[n];
	    for(int i=0;i<n;i++){
	        wts[i] = s.nextInt();
	    }
	    
	    int cap = s.nextInt();
	    
	    int[] dp = new int[cap + 1];
	    dp[0] = 0;
	    for(int c = 1;c<=cap;c++){
	        int max = 0;
	        for(int i=0;i<n;i++){
	            
	            if(wts[i] <= c){
	                int rbagc = c - wts[i];
	                
	                int rbagv = dp[rbagc];
	                
	                int tbagv = rbagv + vals[i];
	                
	                if(tbagv > max){
	                    max = tbagv;
	                }
	            }
	        }
	        dp[c] = max;
	    }
	    System.out.println(dp[cap]);
	}
}