#include<stdio.h>

int main()
	{
	int test,i;

	scanf("%d",&test);

	for(i=0; i<test; i++)
	{
	long long int a3,b,c,n,d,a;
	
	scanf("%lld %lld %lld",&a3,&b,&c);

	n = (2*c)/(a3+b);

        d = (b-a3)/(n-5);

        a = a3-2*d;

        printf("%lld\n",n);

        long long int ap=0;
	int j;
	
        for(j=0; j<n; j++)
        {
        ap = a + j*d;
	printf("%lld ",ap);
        }
        printf("\n");
        }
return 0;
}


