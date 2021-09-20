/*String Compression*/

import java.io.*;
import java.util.*;

public class Main {

  public static String compression1(String str) {
    String s = str.substring(0, 1);
    for (int i = 1; i < str.length(); i++){
        char pr = str.charAt(i-1);
        char c = str.charAt(i);
        if(pr!=c){
            s = s + c;
        }
    }

    return s;
  }

  public static String compression2(String str) {
    String s = str.substring(0, 1);
    int count = 1;
    for(int i=1;i<str.length();i++)
    {
        char c = str.charAt(i);
        char pr = str.charAt(i-1);
        if(c==pr)
        {
            count++;
        }
        else
        {
            if(count>1)
            {
                s+= count;
                count=1;
            }
            s+=c;
        }
        
    }
        if(count>1)
        {
            s+=count;
        }

    return s;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }

}

/*Original String = aaabbccdee
Compression 1 = abcde
Compression 2 = a3b2c2de2*/