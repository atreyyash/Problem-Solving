/*Broken Economy*/

#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int* arr = new int[n];
    for(int i = 0 ; i < n; i++){
        cin>>arr[i];
    }
    int data;
    cin>>data;
    
    int l = 0, m;
    int h = n-1;
    int temp=0;
    while(l<=h)
    {
        m = (l+h)/2;
        if(data>arr[m])
        {
            l = m+1;
        }
        else if(data<arr[m])
        {
            h = m - 1;
        }
        else if(data==arr[m]){
            temp=1;
        }
    }
    
    if(temp==0)
    {
        cout<<arr[l]<<endl<<arr[h];
    }
    else
    {
        cout<<arr[m];
    }    
}