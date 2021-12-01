/*Any base Substraction*/

#include<iostream>
using namespace std;

int getDifference(int b, int n1, int n2){
    
    int rv = 0;
    int c=0, p =1;
    
    while(n2>0)
    {
        int d1 = n1 % 10;
        int d2 = n2 % 10;
        n1 = n1 / 10;
        n2 = n2 / 10;
        d2 = d2 + c;
        int d =0;
        if(d2>=d1)
        {
            c=0;
            d = d2 - d1;
        }
        else
        {
            c=-1;
            d = (d2+b) - d1;
        }
        rv += d*p;
        p = p*10;
        
    }
    return rv;
    
}


int main(){
    int b, n1, n2;
    cin>>b>>n1>>n2;
    cout<<getDifference(b,n1,n2);
}