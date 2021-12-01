/*Zero One Knapsack dp*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int[] vals = new int[n];
        int[] wts = new int[n];
        
        for(int i=0;i<n;i++){
            vals[i] = s.nextInt();
        }
        
        for(int i=0;i<n;i++){
            wts[i] = s.nextInt();
        }
        
        int cap = s.nextInt();
        
        int[][] dp = new int[n+1][cap+1];
        
        for(int i=1;i<dp.length;i++){
            
            for(int j=1;j<dp[0].length;j++){
                
                if(j >= wts[i-1]){
                    
                    int rCap = j - wts[i-1];
                    
                    if(dp[i-1][rCap] + vals[i-1] > dp[i-1][j]){
                        
                        dp[i][j] = dp[i-1][rCap] + vals[i-1];
                    }
                    else{
                        dp[i][j] = dp[i-1][j];  //when i does'nt bat
                    }
                }
                else{
                    dp[i][j] = dp[i-1][j];  //when i does'nt bat
                    
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}