#include <iostream>
using namespace std;

int main(int argc, char **argv){
    int n,r=0,count=0;
    cin >> n;
    
    while(n!=0)
    {
        r = n % 10;
        n =n / 10;
        count++;
    }
    
    cout<<count<<endl;
    
}