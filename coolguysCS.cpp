#include<iostream>
//#include<algorithm>
#include<cstdio>
#include<cmath>

using namespace std;
typedef long long ll;

int main()
{
	int test,i;

	scanf("%d",&test);

	for(i=0; i<test; i++)
	{
		long long n;
		int j;
		scanf("%lld",&n);

		long long tot=n*n;

		long long sum=0 ;

		int sqr = sqrt(n);

		long long int z[2*sqr]; 

		for(j=1; j<=sqr; j++)
		{
			sum += (n/j);
			z[j-1] = (n/j);
		}

		sum += ((z[sqr-1]-sqr)*sqr);	
//		cout<<sum<<endl;

		int y;
		for(y=sqr; y>1; y--)
		{
			sum += (z[y-2] - z[y-1] )*(y-1);
//			cout<<sum<<" y "<<y<<endl;
		}

		long long a = sum;
		long long b = tot;

		long long  gcd =0,mod=0;
		while(true)
		{
			mod = tot%sum;
			if(mod==0)
			{
				gcd = sum;
				break;
			}
			else
			{
				tot = sum;
				sum = mod;
				//mod = sum%mod;
			}
		}
		//	printf("%d/////\n",gcd);

		if(gcd==1)
		{
			printf("%lld/%lld\n",a,b);
		}
		else
		{
			printf("%lld/%lld\n",a/gcd,b/gcd);
		}



	}
	return 0;
}

