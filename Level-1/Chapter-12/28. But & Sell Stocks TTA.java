/*But & Sell Stocks TTA*/

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
        
        int lsf = arr[0];
        int mpsf = 0;
        int[] dpl = new int[arr.length];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < lsf){
                lsf = arr[i];
            }
            
            mpsf = arr[i] - lsf;
            if(mpsf > dpl[i-1]){
                dpl[i] = mpsf;
            }
            else{
                dpl[i] = dpl[i-1];
            }
        }
        
        int mpibt = 0;
        int maxat = arr[arr.length-1];
        int[] dpr = new int[arr.length];
        
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > maxat){
                maxat = arr[i];
            }
            
            mpibt = maxat - arr[i];
            if(mpibt > dpr[i+1]){
                dpr[i] = mpibt;
            }
            else{
                dpr[i] = dpr[i+1];
            }
        }
        
        int op = 0;
        for(int i=0;i<n;i++){
            if(dpl[i] + dpr[i] > op){
                op = dpl[i] + dpr[i];
            }
        }
        
        System.out.println(op);
    }

}