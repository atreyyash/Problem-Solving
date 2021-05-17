#include <iostream>
#include <math.h>
using namespace std;

int main(int argc, char **argv){
    int n,temp;
    cin >> n;
    temp = n;
    int pos, count=1, size=0;
    int r=0;
    
    while(n!=0)         //This while is to count the no of digits
    {
        r = n % 10;
        n = n / 10;
        size++;
    }
    
    int a[size];        //This will create the array of size as counted above
    r=0;
    for(int i=size;i>0;i--)         //This for loop is to calculate the position of inverse no digit
    {
        r = temp % 10;          //This extracts the digit from no.
        temp = temp / 10;       //Shrinks the no.
        pos = size - r;         //Calculate Inverse Poisition
        a[pos] = count;         //Assign the value to that position
        count++;
    }
    
    for(int i=0;i<size;i++)     //Prints the no.
    {
        cout<<a[i];
    }
    
}