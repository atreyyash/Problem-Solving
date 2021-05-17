#include <iostream>
#include<bits/stdc++.h>
#include<cmath>
using namespace std;

int main(int argc, char **argv){
    int a,b,c;
    cin >> a >> b >> c;
    
    int x, y, z;
    if(a>b)
    {
        if(a>c)
        {
            x = a;
            y = b;
            z = c;
        }
        else
        {
            x = c;
            y = a;
            z = b;
        }
    }
    else
    {
        if(b>c)
        {
            x = b;
            y = a;
            z = c;
        }
        else
        {
            x = c;
            y = a;
            z = b;
        }
    }
    
    x = (x * x);
    y = (y * y);
    z = (z * z);
    
    if(x == (y+z))
    {
        cout<<"true"<<endl;
    }
    else
    {
        cout<<"false"<<endl;
    }
    
}