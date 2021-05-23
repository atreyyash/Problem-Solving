#include <iostream>
using namespace std;
int main(int argc, char**argv){
    int n;
    cin >> n;

    int sp = (2*n)-3;
    int st = 1;
    int i=1,j=1;
    
    for(int i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            cout<<j<<"\t";
        }
        for(int r=1;r<=sp;r++)
        {
            cout<<"\t";
        }
        if(i==n)
        {
            j--;
        }
        for(int k=j-1;k>=1;k--)
        {
            cout<<k<<"\t";
        }
        sp-=2;
        st++;
        cout<<endl;
    }
    
}


/*
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	
*/