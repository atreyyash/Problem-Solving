#include <iostream>
#include<bits/stdc++.h>
#include<cmath>

using namespace std;
int main(){
    int n,k, q;
    cin>>n>>k;
    int temp = n;
    int r=0, size=0;
    while(temp!=0)
    {
        temp = temp / 10;
        size++;
    }
    
    k = k % size;
    if(k<0)
    {
        k = k + size;
    }
    
    int div=1, mult=1;
    for(int i=0;i<size;i++)
    {
        if(i<k)
        {
            div = div * 10;
        }
        else{
            mult = mult * 10;
        }
    }
    
    r=0;
    q = n / div;
    r = n % div;
    
    int rot = r * mult + q;
    cout<<rot<<endl;

}