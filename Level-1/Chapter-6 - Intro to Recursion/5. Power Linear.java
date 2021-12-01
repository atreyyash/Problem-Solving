/*Power Linear*/
/*Basically we have to find out the power of a given using recursion*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        else if(n==0){
            return 1;
        }
        else{
            return x*power(x, n-1);
        }
    }

}