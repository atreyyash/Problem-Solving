#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main(int argc, char **argv)
{
    int n,c;
    cin >> n;
    int a=0;
    int b=1;
    
    if(n==0)
    {
        cout<<n<<endl;
    }
    else if(n==1)
    {
        cout<<n<<endl;
    }
    else
    {
        cout<<a<<"\n"<<b<<endl;
        for(int i=0;i<n-2;i++)
        {
            int temp;
            c = a+b;
            cout<<c<<endl;
            temp = c;
            a=b;
            b=temp;
        }
    }

}