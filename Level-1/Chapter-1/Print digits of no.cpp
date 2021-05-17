#include <iostream>
using namespace std;

int main(int argc, char **argv){
    int n,r=0,i=0,a[15];
    cin >> n;

    while(n!=0)
    {
        r = n % 10;
        a[i] = r;
        n = n / 10;
        i++;
    }
    // cout<<i<<endl;
    
    for(int j=i-1;j>=0;j--)
    {
        cout<<a[j]<<endl;
    }
    
}
