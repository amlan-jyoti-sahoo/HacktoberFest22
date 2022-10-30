#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int maxlen(string s)
{
    int n = s.length();
    int ans = 0;
    stack<int> st;

    for (int i = 0; i < n; i++)
    {
        if (s[i] == '(')
        {
            st.push(i);
        }
        else
        {
            if (st.empty() == 0)
            {
                st.pop();
            }
            if (st.empty() == 0)
            {
                ans = max(ans, abs(i - st.top()));
            }
            else
            {
                st.push(i);
            }
        }
    }

    return ans;
}

int main()
{
    string s;
    cin >> s;
    int ans = maxlen(s);
    cout << ans << endl;
    return 0;
}