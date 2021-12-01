/*Merge Two Sorted Arrays*/

import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int i=0, j=0, k=0;
    int m=a.length;
    int n = b.length;
    int t = n+m;
    int[] c = new int[t];
    
    while(i<a.length && j<b.length){
        if(a[i] < b[j]){
            c[k] = a[i];
            i++;
            k++;
        }
        else{
            c[k] = b[j];
            j++;
            k++;
        }
    }
    if(i < a.length){
        for(;i<a.length;i++,k++)
            c[k] = a[i];
    }
    if(j<b.length){
        for(;j<b.length;j++, k++)
            c[k] = b[j];
    }
    
    return c;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}