/*Arrang Building*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    
    long n = s.nextInt();
    
    long ocspace = 1;
    long ocbuilding = 1;
    
    for(long i=2;i<=n;i++){
        long ncbuilding = ocspace;
        long ncspace = ocspace + ocbuilding;
        
        ocbuilding = ncbuilding;
        ocspace = ncspace;
    }
    
    System.out.println((ocspace+ocbuilding) * (ocspace+ocbuilding));
 }

}