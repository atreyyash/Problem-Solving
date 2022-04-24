/*Get Common Elemenst-1*/

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
    for(int i=0;i<a1.length;i++){
        if(hm.containsKey(a1[i])){
            int of = hm.get(a1[i]);
            int nf = of + 1;
            hm.put(a1[i], nf);
        }
        else{
            hm.put(a1[i], 1);
        }
    }
    
    Set<Integer> keys = hm.keySet();
    for(int i=0;i<a2.length;i++){
        if(hm.containsKey(a2[i])){
            System.out.println(a2[i]);
            hm.remove(a2[i]);
        }
    }
 }

}