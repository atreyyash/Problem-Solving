/*Remove Primes from ArrayList*/

import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean isPrime(int n)
	{
	    for(int i=2;i*i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            return false;
	        }
	    }
	    return true;
	}

	public static void solution(ArrayList<Integer> al){
	    //int n = al.size();
		for(int i=al.size()-1;i>=0;i--)
		{
		    int val = al.get(i);
		    if(isPrime(val)==true)
		    {
		        //System.out.println("I am Here.");
		        al.remove(i);
		    }
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}

/*
Sample Input : 
		4
		3 12 13 15
Sample Output :  [12, 15]
*/