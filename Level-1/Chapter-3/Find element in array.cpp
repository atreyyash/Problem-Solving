#include<iostream>
using namespace std;


int main(){
    int n;
    cin>>n;
    int a[n];
    int d;
    int temp =0, i=0;
    
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cin>>d;
    
    for(i=0;i<n;i++)
    {
        if(d==a[i])
        {
            temp=1;
            break;
        }
    }
    
    if(temp)
    {
        cout<<i;
    }
    else
    {
        cout<<"-1";
    }
    
    return 0;
}