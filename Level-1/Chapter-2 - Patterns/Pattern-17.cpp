#include <iostream>
using namespace std;
int main(int agrc, char**argv){
    int n;
    cin >> n;

    int sp = n/2;
    int st = 1;
    int col = n/2+1;
    
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=sp;j++)
        {
            if(i==col)
            {
                cout<<"*\t";
            }
            else
            {
                cout<<"\t";
            }
        }
        for(int j=1;j<=st;j++)
        {
            cout<<"*\t";
        }
        if(i<=n/2)
        {
            st+=1;
        }
        else
        {
            st-=1;
        }
        cout<<endl;
    }
    
}

/*
		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	
*/