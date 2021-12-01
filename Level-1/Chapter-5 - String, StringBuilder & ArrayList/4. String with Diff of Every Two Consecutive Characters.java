/*String with Difference of Every Two Consecutive Charecters*/

import java.io.*;
import java.util.*;

public class Main {

  public static String solution(String str) {
    String s = str.substring(0,1);
    for(int i=1;i<str.length();i++)
    {
        char current = str.charAt(i);
        char prev = str.charAt(i-1);
        int diff = (int)(current - prev);
        s += diff;
        s += current;
    }

    return s;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }

}

/*
For an input like "abecd" 
We should get an output like "a-1b3e-2c1d"
Sample Input : pepCODinG
Sample Output : p-11e11p-45C12O-11D37i5n-39G
*/