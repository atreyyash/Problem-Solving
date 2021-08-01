#include<iostream>
#include<bits/stdc++.h>
#include<string.h>

using namespace std;

string compression2(string s);
string compression1(string s)
{
    string c = s.substr(0,1);
    for(int i=1;i<s.length();i++)
    {
        char cc = s[i];
        char p = s[i-1];
        if(cc != p)
        {
            c += cc;
        }
    }
    
    return c;
}

string compression2(string s)
{
    string c = s.substr(0,1);
    int cnt = 1;
    for(int i=1;i<s.length();i++)
    {
        char cc = s[i];
        char p = s[i-1];
        
        if(cc == p)
        {
            cnt++;
        }
        else
        {
            if(cnt>1)
            {
                string temp = to_string(cnt);
                c += temp;
                cnt=1;
            }
            c += cc;
        }
        
    }
    
    if(cnt>1)
    {
        string temp = to_string(cnt);
        c += temp;
        cnt=1;
    }
    
    return c;
}

int main()
{
    string s;
    getline(cin, s);
    
    string c1 = compression1(s);
    
    string c2 = compression2(s);
    
    cout<<c1<<endl<<c2;
    
    return 0;
}