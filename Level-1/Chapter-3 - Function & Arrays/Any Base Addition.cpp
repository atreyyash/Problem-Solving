/*any base addition*/

#include<iostream>

using namespace std;

int getSum(int b, int n1, int n2){
    
    int rv = 0;
    
    int c=0, p=1;
    while(n1>0 || n2>0 || c>0)
    {
        int d1 = n1 % 10;
        int d2 = n2 % 10;
        n1 = n1 / 10;
        n2 = n2 / 10;
        
        int d = d1 + d2 + c;
        c = d / b;
        d = d % b;
        
        rv += d*p;
        p = p * 10;
    }
	return rv;
}


int main() {
    int b, n1, n2;
    cin >> b >> n1 >> n2;
    cout << getSum(b, n1, n2) << endl;
}