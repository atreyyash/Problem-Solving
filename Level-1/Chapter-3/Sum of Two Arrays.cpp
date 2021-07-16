#include<iostream>
using namespace std;

int main(){
    int n1, n2;
    cin>>n1;
    int* a1 = new int[n1];
    for(int i = 0 ; i < n1; i++){
        cin>>a1[i];
    }
    
    cin>>n2;
    int* a2 = new int[n2];
    for(int i = 0 ; i < n2; i++){
        cin>>a2[i];
    }
    int n3 = (n1>n2)? n1:n2;
    
    int* a3 = new int[n3];
    
    int i = n1-1;
    int j = n2 - 1;
    int k = n3 - 1;
    int c = 0;
    while(k>=0)
    {
        int d = c;
        
        if(i>=0)
        {
            d += a1[i];;
        }
        
        if(j>=0)
        {
            d += a2[j];
        }
        
        c = d / 10;
        d = d % 10;
        
        a3[k] = d;
        
        
        i--;
        j--;
        k--;
    }
    
    if(c!=0)
    {
        cout<<c;
    }
    // for(int val: a3)
    // {
    //     cout<<val;
    // }
    for(int q=0;q<n3;q++)
    {
        cout<<a3[q]<<endl;
    }
}