/*Base Conversion*/

#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int base_convertor(int n, int b)
{
    int a[100];
    int i=0;
    while(n!=0)
    {
        int r;
        r = n % b;
        n = n / b;
        a[i] = r;
        i++;
    }
    for(int j=i-1;j>=0;j--)
    {
        cout<<a[j];
    }
}

int main()
{
    int n, b;
    cin>>n>>b;
    
   base_convertor(n, b);
    
    return 0;
}