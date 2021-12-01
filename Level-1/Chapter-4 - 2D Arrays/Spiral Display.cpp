#include<iostream>
#include<bits/stdc++.h>

using namespace std;

void spiralPrint(int a[][100], int n, int m)
{
    int sr = 0;
    int er = n-1;
    int sc = 0;
    int ec = m-1;
    int t = n*m;
    int cnt = 0;
    while(sr <= er && sc <= ec)
    {
        //first column
        if(cnt<t)
        {
        for(int i=sr;i<=er;i++)
        {
            cout<<a[i][sc]<<endl;
            cnt++;
        }
        sc++;
        }
        
        //Last Row
        if(cnt<t)
        {
            for(int i=sc;i<=ec;i++)
            {
                cout<<a[er][i]<<endl;
                cnt++;
            }
            er--;
        }
        
        //Last Column
        if(cnt<t)
        {
            for(int i=er;i>=sr;i--)
            {
                cout<<a[i][ec]<<endl;
                cnt++;
            }
            ec--;
        }
        
        //Top Row
        if(cnt<t)
        {
            for(int i=ec;i>=sc;i--)
            {
                cout<<a[sr][i]<<endl;
                cnt++;
            }
            sr++;
        }
        
        
    }
}

int main()
{
    int n, m;
    cin>>n>>m;
    int a[100][100];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            cin>>a[i][j];
        }
    }
    
    spiralPrint(a, n, m);
    
    return 0;
}