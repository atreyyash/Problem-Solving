/*Coin Change Permutations*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        
        int tar = s.nextInt();
        
        int[] dp = new int[tar+1];
        dp[0] = 1;
        for(int amt=1;amt<dp.length;amt++){
            for(int coin : arr){
                if(coin <= amt){
                    int ramt = amt - coin;
                    dp[amt] += dp[ramt];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}