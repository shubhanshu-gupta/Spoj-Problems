#include<stdio.h>

int main()
	{
	int test,i;
	
	scanf("%d",&test);
	
	for(i=0; i<test; i++)
	{
	long long n,sum=0;
	
	scanf("%lld",&n);
	
	if(n%2==0)
        {
        sum = (n*(n+2)*(2*n+1))/8;
        }
        else
        {
        sum = (n*(n+2)*(2*n+1)-1)/8;
        }
	
	printf("%lld\n",sum);

	}
return 0;
}
