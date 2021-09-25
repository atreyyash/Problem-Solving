/*Tower of Hanoi*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t1d = s.nextInt();
        int t2d = s.nextInt();
        int t3d = s.nextInt();
        toh(n, t1d, t2d, t3d);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0){
            return;
        }
        toh(n-1, t1id, t3id, t2id); //will give n-1 tiles from t1 to t3 using t2
        System.out.println(n + "["+ t1id + " -> " + t2id + "]");
        toh(n-1, t3id, t2id, t1id);  //will give n-1 tiles from t3 to t2 using t1
    }

}