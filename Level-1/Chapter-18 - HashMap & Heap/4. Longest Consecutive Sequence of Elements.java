/*Longest Consecutive Sequence of Elements*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i] = s.nextInt();
    }
    
    HashMap<Integer, Boolean> hm = new HashMap<>();
    for(int val : a){
        hm.put(val, true);
    }
    
    for(int val : a){
        if(hm.containsKey(val -1)){
            hm.put(val, false);
        }
    }
    
    int ml = 0;
    int msp = 0;
    for(int val : a){
        if(hm.get(val)==true){
            int tl = 1;
            int tsp = val;
            
            while(hm.containsKey(tsp + tl)){
                tl++;
            }
            
            if(tl > ml){
                msp = tsp;
                ml = tl;
            }
        }
    }
    
    for(int i=0;i<ml;i++){
        System.out.println(msp+i);
    }
 }

}