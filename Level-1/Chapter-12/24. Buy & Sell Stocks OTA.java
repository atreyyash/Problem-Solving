/*Buy & Sell Stocks OTA*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int[] prices = new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i] = s.nextInt();
        }
        
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(pist > op){
                op = pist;
            }
        }
        
        System.out.println(op);
    }

}