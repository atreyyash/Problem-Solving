/*Sort Dates*/

import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    countSort(arr, 1000000, 100, 32);   //Days
    countSort(arr, 10000, 100, 13);   //Months
    countSort(arr, 1, 10000, 2501);   //Year
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    String[] ans = new String[arr.length];
    int[] farr = new int[range];
   
   //Make frequency arr
   for(int i=0;i<arr.length;i++){
       farr[Integer.parseInt(arr[i], 10) / div % mod]++;
   }
   
   //Convert it into prefix um array
   for(int i=1;i<farr.length;i++){
       farr[i] += farr[i-1];
   }
   
   //Stable Sorting
   for(int i=arr.length-1;i>=0;i--){
       int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
       ans[pos] = arr[i];
       farr[Integer.parseInt(arr[i], 10) / div % mod]--;
   }
   
   //Filling original with the help of ans array
   for(int i=0;i<ans.length;i++){
    arr[i] = ans[i];   
   }
   
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}