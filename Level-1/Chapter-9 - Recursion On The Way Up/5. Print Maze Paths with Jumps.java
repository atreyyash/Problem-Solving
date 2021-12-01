/*Print Maze Paths With Jumps*/

import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int dr = s.nextInt();
    int dc = s.nextInt();
    printMazePaths(1, 1, dr, dc, "");
}

// sr - source row
// sc - source column
// dr - destination row
// dc - destination column
public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
    if(sr==dr && sc==dc){
        System.out.println(psf);
        return;
    }
    if(sc>dc){
        return;
    }
    else if(sr>dr){
        return;
    }
    for(int ms=1;ms<=dc-sc;ms++){
        printMazePaths(sr, sc+ms, dr, dc, psf+"h"+ms);
    }
    for(int ms=1;ms<=dr-sr;ms++){
        printMazePaths(sr+ms, sc, dr, dc, psf+"v"+ms);
    }
    
    for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
        printMazePaths(sr+ms, sc+ms, dr, dc, psf+"d"+ms);
    }
}

}