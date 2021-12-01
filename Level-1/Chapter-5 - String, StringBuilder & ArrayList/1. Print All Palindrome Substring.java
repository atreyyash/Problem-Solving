/*Print All Palindrome Substring*/

import java.io.*;
import java.util.*;

public class Main{
    
    public static boolean isPalindrome(String s)
	{
	    int i=0;
	    int j=s.length()-1;
	    while(i<=j)
	    {
	        char ch1 = s.charAt(i);
	        char ch2 = s.charAt(j);
	        if(ch1 == ch2)
	        {
	            i++;
	            j--;
	        }
	        else{
	            return false;
	        }
	    }
	    return true;
	}
    
	public static void solution(String str){
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<=str.length();j++)
		    {
		        String s = str.substring(i, j);
		        if(isPalindrome(s)==true)
		        {
		            System.out.println(s);
		        }
		    }
		}
		
	}
	


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}

/*abccbc is the inputted string and we have to print all the Palindrome(same from both sides) substring*/