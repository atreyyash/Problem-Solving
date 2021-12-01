#include <iostream>
using namespace std;

int main(int argc, char **argv){
    int n;
    int temp;
    cin >> n;
    int a=0, b =1, c=a+b;
    cout<<a<<endl;
    cout<<b<<"\t"<<c<<endl;
    temp =c;
    a = b;
    b = temp;
    for(int i=3;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            c = a + b;
            cout<<c<<"\t";
            temp = c;
            a = b;
            b = temp;
        }
        cout<<endl;
    }
    
}

/*
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377
*/