#include<iostream>
#include<algorithm>
#include<cstdio>

using namespace std;

int main()
	{
	int i;
	
	long long n,flg=0;	

	scanf("%lld",&n);
	
	long long c[n];
	
	for(i=0; i<n; i++)
	{
	scanf("%lld ",&c[i]);
	} 

	sort(c,c+n);
	flg = upper_bound(c,c+n,0)-c;
	
	long long x;

	scanf("%lld",&x);
		
	if(flg<x)
	{
	 long long tot =0;
	int k;
                for(k=0; k<flg; k++)
                {
                tot += c[k];
                }
                tot = (-1)*tot;
                printf("%lld\n",tot);
        }
	 else if(x==0)
        {
        printf("%d\n",0);
        }
        else
        {
                long long total=0;
		int h;
//              int su = ((-1)*c.get(x))*x;
	
                long long su = ((-1)*c[x])*x;

                for(h=0; h<x; h++)
                {
//              total += (c.get(h)-c.get(x));
                total += (c[h]-c[x]);

                }
                total = (-1)*total;
		long long all = total+su;
                printf("%lld\n",all);
        }
return 0;
}

