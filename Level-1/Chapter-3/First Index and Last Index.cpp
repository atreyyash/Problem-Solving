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
    int lastIndex=-1;
    while(l<=h)
    {
        m = (l+h)/2;
        if(arr[m]>data)
        {
            h = m - 1;
        }
        else if(arr[m]<data)
        {
            l = m + 1;
        }
        else if(data==arr[m])
        {
            lastIndex=m;
            l = m + 1;
        }
    }
    int firstIndex=-1;
    l = 0;
    h = n-1;
    while(l<=h)
    {
        m = (l+h)/2;
        if(arr[m]>data)
        {
            h = m - 1;
        }
        else if(arr[m]<data)
        {
            l = m + 1;
        }
        else if(data==arr[m])
        {
            firstIndex=m;
            h = m - 1;
        }
    }
    
    cout<<firstIndex<<endl<<lastIndex;    
}