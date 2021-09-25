/*Print Logarithmic*/

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int n = s.nextInt();
      System.out.println(power(x, n));
  }

  public static int power(int x, int n) {
      if(n==0){
          return 1;
      }
      int xpnb2 = power(x, n/2);
      int xn = xpnb2 * xpnb2;
      
      if(n % 2 == 1){
          xn = xn * x;
      }
      
      return xn;
  }

}