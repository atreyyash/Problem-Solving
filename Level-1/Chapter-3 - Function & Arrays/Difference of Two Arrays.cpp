#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int main(){
    int n1, n2;
    cin>>n1;
    int* a1 = new int[n1];
    for(int i = 0 ; i < n1; i++){
        cin>>a1[i];
    }
    
    cin>>n2;
    int* a2 = new int[n2];
    for(int i = 0 ; i < n2; i++){
        cin>>a2[i];
    }
    int n3 = (n1>n2)? n1:n2;
    
    int* a3 = new int[n2];
    
    int i = n1-1;
    int j = n2 - 1;
    int k = n3 - 1;
    int b = 0;
    while(k>=0)
    {
        int d = 0;
        int a1v = i>=0? a1[i]:0;
        if(a2[j]+b>=a1v)
        {
            d = a2[j] + b - a1v;
            b = 0;
        }
        else
        {
            d = a2[j] + (b + 10) - a1v;
            b = -1;
        }
        
        a3[k] = d;
        
        
        i--;
        j--;
        k--;
    }
    int q=0;
    for(;q<n3;q++)
    {
        if(a3[q] ==0)
        {
            continue;
        }
        else{
            break;
        }
    }
    
    // for(int val: a3)
    // {
    //     cout<<val;
    // }
    for(;q<n3;q++)
    {
        cout<<a3[q]<<endl;
    }
}