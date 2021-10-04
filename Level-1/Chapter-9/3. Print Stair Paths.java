/*Print Stairs Paths*/
/*This ques is based on level and option recursion where we get our ans in at the base case and it solved down to top order*/
/*Note :- Faith Expectation recursion is solved down to top and the top to down and we get answers while getting down the stack.*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printStairPaths(n, "");
    }

    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }
        else if(n<0){
            return;
        }
        
        printStairPaths(n-1, path+"1");
        printStairPaths(n-2, path+"2");
        printStairPaths(n-3, path+"3");
    }

}