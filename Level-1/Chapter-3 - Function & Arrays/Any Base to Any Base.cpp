#include<iostream>
#include<bits/stdc++.h>
#include<cmath>

using namespace std;

int a2d(int n, int b)
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

int d2a(int n, int b)
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

int a2a(int n, int b1, int b2)
{
    int d = a2d(n, b1);
    d2a(d , b2);
}



int main()
{
    int n , b1, b2;
    cin>>n>>b1>>b2;
    
    a2a(n, b1, b2);
}