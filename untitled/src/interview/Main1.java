#include<cstdio>
#include<cstring>
#include<cmath>
#include<algorithm>
using namespace std;
        const int maxn=100000+10;
        char st[maxn];
        int ans;
        int dp[maxn];
        int main()
        {
        scanf("%s",st+1);int len=strlen(st+1);
        for(int i=1;i<=len;i++)
        {
        if(st[i]=='(' || st[i]=='[')continue;
        if(st[i]==')' || st[i]==']')
        {
        if((st[i]==')' && st[i-1-dp[i-1]]=='(') || (st[i]==']' && st[i-1-dp[i-1]]=='['))
        {
        dp[i]=dp[i-1]+2+dp[i-2-dp[i-1]];
        ans=max(ans,dp[i]);
        }
        }
        }
        for(int i=1;i<=len;i++)
        if(dp[i]==ans)
        {
        for(int j=i-ans+1;j<=i;j++)printf("%c",st[j]); return 0;
        }
        }