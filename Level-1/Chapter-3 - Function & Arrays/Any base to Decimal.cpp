/*Any Base to Decimals*/

#include<iostream>
#include<bits/stdc++.h>
#include<cmath>

using namespace std;

int base_changer(int n, int b)
{
    int i=0, w=0;
    int a[100];
    
    while(n!=0)
    {
        int r = 0;
        r = n % 10;
        n = n / 10;
        w += r * pow(b, i);
        i++;
    }
    
    return w;
    
}


int main()
{
    int n, b;
    cin>>n>>b;
    
    cout<<base_changer(n, b);
    
    return 0;
}