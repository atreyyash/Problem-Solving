/*Fibonacci Dp*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    int fbnc = fibomemoized(n, new int[n+1]);
    System.out.println(fbnc);
 }
 
 public static int fibomemoized(int n, int[] qb){
     if(n==0 || n==1){
         return n;
     }
     
     if(qb[n] != 0){
         return qb[n];
     }
     
     int fb1 = fibomemoized(n-1, qb);
     int fb2 = fibomemoized(n-2, qb);
     int fb = fb1 + fb2;
     qb[n] = fb;
     return fb;
     
 }

}