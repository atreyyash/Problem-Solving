/*Buy & Sell Stocks Transaction Fee ITA*/

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
        
        int fee = s.nextInt();
        
        int obsp = -arr[0];
        int ossp = 0;
        
        for(int i=1;i<arr.length;i++){
            int nssp = 0;
            int nbsp = 0;
            
            if(ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }
            else{
                nbsp = obsp;
            }
            
            if(obsp + arr[i] - fee > ossp){
                nssp = obsp + arr[i] - fee;
            }
            else{
                nssp = ossp;
            }
            
            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }

}