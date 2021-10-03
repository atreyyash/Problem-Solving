/*Get Maze Path*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int dr = s.nextInt();
        int dc = s.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, dr, dc);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(sr>dr){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        else if(sc>dc){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        
        ArrayList<String> path1 = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> path2 = getMazePaths(sr+1, sc, dr, dc);
        
        ArrayList<String> allPaths = new ArrayList<>();
        
        for(String path: path1){
            allPaths.add("h" + path);
        }
        
        for(String path: path2){
            allPaths.add("v" + path);
        }
        return allPaths;
    }

}