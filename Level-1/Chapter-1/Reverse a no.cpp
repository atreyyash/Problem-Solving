#include <iostream>
using namespace std;

int main(int argc, char **argv){
    int n, rev=0;
    cin >> n;

    while(n!=0)
    {
        int r=0;
        r = n % 10;
        n = n / 10;
        cout<<r<<endl;
    }
}