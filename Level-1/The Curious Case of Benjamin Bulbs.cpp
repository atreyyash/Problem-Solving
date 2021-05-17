#include<iostream>
using namespace std;
int main(int argc, char**argv){
    int n;
    cin>>n;
    
    for(int i=1;i*i<=n;i++)
    {
        cout<<i*i<<endl;
    }
}

//All the bulbs which are touched odd no of no. of times will remain onn as initially all were in off condition. So we need to only print the perfect squares which comes before n. This is more kind of puzzle then the actual problem.