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
    
    //Transpose
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            int temp = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = temp;
        }
    }
    
    //Reverse
    for(int i=0;i<n;i++)
    {
        int li = 0;
        int ri = n-1;
        while(li<ri)
        {
            int temp = a[i][li];
            a[i][li] = a[i][ri];
            a[i][ri] = temp;
            
            li++;
            ri--;
        }
    }
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cout<<a[i][j]<<" ";
        }
        cout<<endl;
    }
    
}