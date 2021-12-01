#include <iostream>
using namespace std;
int main(int argc, char**argv){
    int n;
    cin >> n;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i<=n/2)
            {
                if(j==1 || j==n)
                {
                    cout<<"*\t";
                }
                else
                {
                    cout<<"\t";
                }
            }
            else if(i==n/2+1)
            {
                if(j==1 || j==n/2+1 || j==n)
                {
                    cout<<"*\t";
                }
                else
                {
                    cout<<"\t";
                }
            }
            else if(i>n/2 && i<n)
            {
                if((j!=n/2+1) && ((i+j)%2==0 ||  j==1 || j==n))
                {
                    cout<<"*\t";
                }
                else
                {
                    cout<<"\t";
                }
            }
            else if(i==n)
            {
                if(j==1 || j==n)
                {
                    cout<<"*\t";
                }
                else
                {
                    cout<<"\t";
                }
            }
        }
        cout<<endl;
        
    }

}

/*
*				*	
*				*	
*		*		*	
*	*		*	*	
*				*	
*/