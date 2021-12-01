#include <iostream>
using namespace std;
int main(int argc, char**argv){
    int n;
    cin >> n;

    int sp = n/2;
    int st = 1;
    int val = 1;
    
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=sp;j++)
        {
            cout<<"\t";
        }
        int cval = val;
        for(int j=1;j<=st;j++)
        {
            cout<<cval<<"\t";
            
            if(j<=st/2)
            {
                cval++;
            }
            else
            {
                cval--;
            }
        }
        cout<<endl;
        
        if(i <= n/2)
        {
            sp--;
            st+=2;
            val++;
        }
        else
        {
            sp++;
            st-=2;
            val--;
        }
    }
    
}

/*
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
*/