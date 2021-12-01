#include<iostream>
using namespace std;

void reverse(int* arr, int n, int m){
    int i=n, j=m-1;
    while(i<j)
    {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}

void rotate(int* arr, int n, int k){
   k = k % n;
   if(k<0)
   {
       k = k + n;
   }
   
   //Reverse whole array
    reverse(arr, 0, n);
   
   //Reverse 1st Part of Array
    reverse(arr, 0, k);
   
   //Reverse 2nd Part of Array
    reverse(arr, k, n);
    
}

void display(int* arr, int n){
    for(int i = 0 ; i < n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main(){
    int n, r;
    cin>>n;
    int* arr = new int[n];
    for(int i = 0 ; i < n; i++){
        cin>>arr[i];
    }
    cin>>r;
    
    rotate(arr,n,r);
    display(arr,n);
}