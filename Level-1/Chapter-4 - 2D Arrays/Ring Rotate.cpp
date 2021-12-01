#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int fillfromShell(int a[][100], int s);
void rotate(int a[], int r);
void reverse(int oned[], int li, int ri);
void rotateShell(int a[][100], int s, int r)
{
    int oned = fillfromShell(a, s);
    rotate(oned, r);
    fillShellFromOned(a, s, oned);
    
    // for(int i=0;i<n;i++)
    // {
    //     for(int j=0;j<m;j++)
    //     {
    //         cout<<a[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }
}

int[] fillfromShell(int a[][], int s, int r)
{
    int minr = s - 1;
    int minc = s - 1;
    int maxr = n - s;
    int maxc = n - s;
    int size = 2 * (maxr-minr+maxc-minc);
    int oned[size];
    
    //LW
    int idx = 0;
    for(int i=minr;i<=maxr;i++)
    {
        oned[idx] = a[idx][minc];
        idx++;
    }
    minc++;
    
    //BW
    for(int i=minc;i<=maxc;i++)
    {
        oned[idx] = a[maxr][idx];
        idx++;
    }
    maxr--;
    
    //RW
    for(int i=maxr;i>=minr;i--)
    {
        oned[idx] = a[idx][maxc];
        idx++;
    }
    maxc--;
    
    //TW
    for(int i=maxc;i>=minc;i--)
    {
        oned[idx] = a[minr][idx];
        idx++;
    }
    minr++;
    
    return oned;
}

void fillShellFromOned(int a[][], int s, int oned[])
{
    int minr = s - 1;
    int minc = s - 1;
    int maxr = n - s;
    int maxc = n - s;
    int size = 2 * (maxr-minr+maxc-minc);
    int oned[size];
    
    //LW
    int idx = 0;
    for(int i=minr;i<=maxr;i++)
    {
        a[idx][minc] = oned[idx];
        idx++;
    }
    minc++;
    
    //BW
    for(int i=minc;i<=maxc;i++)
    {
        a[idx][maxr] = oned[idx];
        idx++;
    }
    maxr--;
    
    //RW
    for(int i=maxr;i>=minr;i--)
    {
        a[idx][maxc] = oned[idx];
        idx++;
    }
    maxc--;
    
    //TW
    for(int i=maxc;i>=minc;i--)
    {
        a[idx][minr] = oned[idx];
        idx++;
    }
    minr++;
}

void rotate(int a[], int r)
{
    r = r % n;
    if(r<0)
    {
        r = r + n;
    }
    
    reverse(oned, 0, n-r-1);
    reverse(oned, n-r, n-1);
    reverse(oned, 0, n-1);
}

void reverse(int oned[], int li, int ri)
{
    while(li<ri)
    {
        int temp = oned[li];
        a[li] = a[ri];
        a[ri] = temp;
        
        li++;
        ri--;
    }
}

int main()
{
    int n, m;
    cin>>n>>m;
    int a[n][m];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            cin>>a[i][j];
        }
    }
    int s, r;
    cin>>s>>r;
    
    rotateShell(a, s, r);
    
    
    
}