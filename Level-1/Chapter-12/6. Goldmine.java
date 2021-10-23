/*Goldmine*/

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int m = s.nextInt();

    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = s.nextInt();
      }
    }

    int[][] dp = new int[n][m];

    for (int j = dp[0].length - 1; j >= 0; j--) {
      for (int i = dp.length - 1; i >= 0; i--) {
        if (j == arr[0].length - 1) {
          dp[i][j] = arr[i][j];
        }
        else if (i == 0) {
          dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
        }
        else if (i == arr.length - 1) {
          dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
        }
        else {
          dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1]));
        }
      }
    }
    int max = dp[0][0];
    for (int i = 1, j = 0; i < arr.length; i++) {
      if (max < dp[i][j]) {
        max = dp[i][j];
      }
    }
    System.out.println(max);
  }

}