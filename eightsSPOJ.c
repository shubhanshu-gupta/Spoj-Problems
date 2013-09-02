#include<stdio.h>

int main()
	{
	int test;

	scanf("%d",&test);
	
	int i;

	for(i=0; i<test; i++)
	{
	long long int k;

	scanf("%llu",&k);
	
	if(k==1)
	{
	printf("192\n");
	}
	else
	{
	long long sum = 192 + (k-1)*250;
	
	printf("%llu\n",sum);
	}

	}
return 0;
	}
