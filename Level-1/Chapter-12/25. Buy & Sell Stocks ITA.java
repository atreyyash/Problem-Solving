/*Buy & Sell Stocks ITA*/

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
        
        int bd = 0;
        int sd = 0;
        int profit = 0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i] >= prices[i-1]){
                sd++;
            }
            else{
                profit += prices[sd] - prices[bd];
                bd = sd = i;
            }
        }
        profit += prices[sd] - prices[bd];
        System.out.println(profit);
    }

}