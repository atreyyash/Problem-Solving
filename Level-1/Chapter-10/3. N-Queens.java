/*N-Queens*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];
        printNQueens(arr, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }
        
        for(int col=0;col<chess.length;col++){
            if(safe(chess, row, col)==true){
                chess[row][col] = 1;
                printNQueens(chess, qsf+row+"-"+col+", ", row+1);
                chess[row][col] = 0;
            }
        }
    }
    
    public static boolean safe(int[][] arr, int row, int col){
        for(int i=row-1, j=col;i>=0;i--){
            if(arr[i][j]==1){
                return false;
            }
        }
        
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(arr[i][j] == 1){
                return false;
            }
        }
        
        for(int i=row-1, j=col+1; i>=0 && j<arr.length; i--, j++){
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;
    }
}