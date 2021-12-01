/*Display Array In Reverse*/
/*We have to print the array element in reverse order*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }
        displayArrReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }

}