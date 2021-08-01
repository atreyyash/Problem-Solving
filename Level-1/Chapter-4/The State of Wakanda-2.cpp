#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int a[n][n];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>a[i][j];
        }
    }

    for(int g=0;g<n;g++)
    {
        for(int i=0,j=g;j<n;j++,i++)
        {
            cout<<a[i][j]<<endl;
        }
    }

}