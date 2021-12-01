/*Count Binary String*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    
    int oczeroes = 1;
    int ocones = 1;
    
    for(int i=2;i<=n;i++){
        int nczeroes = ocones;
        int ncones = oczeroes + ocones;
        
        ocones = ncones;
        oczeroes = nczeroes;
        
    }
    
    System.out.println(oczeroes + ocones);
 }

}