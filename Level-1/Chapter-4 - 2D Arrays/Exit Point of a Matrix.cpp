#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, m;
    cin>>n>>m;
    int a[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            cin>>a[i][j];
        }
    }
    
    int dir=0;  //e-0, s-1, w-2, n-3
    int i=0;
    int j=0;
    
    while(i<n && j<m)
    {
        dir = (dir + a[i][j]) % 4;
        
        if(dir==0) //east
        {
            j++;
        }
        else if(dir==1)  //south
        {
            i++;
        }
        else if(dir==2)  //west
        {
            j--;
        }
        else if(dir==3)  //north
        {
            i--;
        }
        
        if(i<0)
        {
            i++;
            break;
        }
        else if(j<0)
        {
            j++;
            break;
        }
        else if(i==n)
        {
            i--;
            break;
        }
        else if(j==m)
        {
            j--;
            break;
        }
    }
    
    cout<<i<<endl<<j;
    
    
    return 0;
    
}