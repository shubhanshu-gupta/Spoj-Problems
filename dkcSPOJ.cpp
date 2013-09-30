#include<iostream>
#include<algorithm>
#include<cstdio>

using namespace std;

int main()
{
	int test,i;

	scanf("%d",&test);

	for(i=0; i<test; i++)
	{
		int n;

		scanf("%d",&n);

		int k[n];

		int c1=0,c2=0,j;

		for(j=0; j<n; j++)
		{
			scanf("%d",&k[j]);

			int r=0;

			if(k[j]%5==0)
			{
				r = k[j];
			}
			else if(k[j]%5 < 2.5)
			{
				r = k[j] - k[j]%5;
			}
			else
			{
				r = k[j] + (5 - k[j]%5);
			}

			int diff = r-k[j];

			if(diff>=0)
				c1+=diff;
			else
				c2+=diff;
		}

		if(c1+c2>=0)
			printf("PROFIT\n");
		else
			printf("BAD SYSTEM\n");

	}
	return 0;
}
