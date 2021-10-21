/*Climb Stais dp*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        System.out.println(countPathsTab(n));
    }
    
    public static int countPaths(int n, int[] qb){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        
        int n1 = countPaths(n-1, qb);
        int n2 = countPaths(n-2, qb);
        int n3 = countPaths(n-3, qb);
        
        int cp = n1 + n2 + n3;
        qb[n] = cp;
        
        return cp;
        
    }
    
    public static int countPathsTab(int n){
        int[] dp = new int[n+1];
        
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i] = dp[i-1];
            }
            else if(i==2){
                dp[i] = dp[i-1] + dp[i-2];
            }
            else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; 
            }
        }
        return dp[n];
    }

}