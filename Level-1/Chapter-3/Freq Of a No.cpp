/*Count the frequency of a given number.*/

#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int freq(int n, int d)
{
    int count =0;
    
    while(n!=0)
    {
        int r = n % 10;
        n = n / 10;
        if(r == d)
        {
            count++;
        }
    }
    return count;
}

int main()
{
    int n;
    int d;
    cin>>n>>d;
    
    int f = freq(n, d);
    cout<<f<<endl;
    
    return 0;
}