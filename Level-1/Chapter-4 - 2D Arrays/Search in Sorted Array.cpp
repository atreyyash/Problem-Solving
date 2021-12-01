#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int a[100][100];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>a[i][j];
        }
    }
    int x;
    cin>>x;
    
    int i=0;
    int j=n-1;
    
    while(i<n && j>=0)
    {
        if(x ==a[i][j])
        {
            cout<<i<<endl<<j;
            return 0;
        }
        else if(x < a[i][j])
        {
            j--;
        }
        else
        {
            i++;
        }
    }
    
    cout<<"Not Found";
    
    
    
    
}
