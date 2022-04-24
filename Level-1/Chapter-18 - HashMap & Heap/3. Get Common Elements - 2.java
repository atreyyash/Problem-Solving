/*Get Common Elements - 2*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    
    int n1 = s.nextInt();
    int[] a1 = new int[n1];
    for(int i=0;i<n1;i++){
        a1[i] = s.nextInt();
    }
    
    int n2 = s.nextInt();
    int[] a2 = new int[n2];
    for(int i=0;i<n2;i++){
        a2[i] = s.nextInt();
    }
    
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int val: a1){
        if(hm.containsKey(val)){
            int of = hm.get(val);
            int nf = of + 1;
            hm.put(val, nf);
        }
        else{
            hm.put(val, 1);
        }
    }
    
    for(int val: a2){
        if(hm.containsKey(val) && hm.get(val) > 0){
            System.out.println(val);
            int of = hm.get(val);
            int nf = of - 1;
            hm.put(val, nf);
        }
    }
 }

}