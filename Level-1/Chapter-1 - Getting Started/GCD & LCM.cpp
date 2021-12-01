#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main(int argc, char **argv){
    int num1, num2;
    cin >> num1 >> num2;
    int x, y, r;
    
    if(num1>num2)
    {
        x = num1;
        y = num2;
    }
    else
    {
        x = num2;
        y = num1;
    }
    
    r = y;
    int mult = num1 * num2;
    
    while(x%y != 0)
    {
        r = x % y;
        x = y;
        y = r;
    }
    cout<<r<<endl;
    
    int lcm = mult / r;
    
    cout<<lcm<<endl;
}