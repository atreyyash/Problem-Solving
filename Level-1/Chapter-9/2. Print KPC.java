/*Print KPC*/
/*In this ques we dont save all the outcomes of the KPc we just print them and free the memory after every output.*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printKPC(str, "");
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        String codeforch = codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            printKPC(ros, asf+chcode);
        }

    }

}