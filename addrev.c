#include<stdio.h>

int main()
{

int cases,a,b,revA=0,revB=0,sum=0,revS;
	
	scanf("%d\n",&cases);

	while(cases>0)
	{
	scanf("%d %d",&a, &b);
	
	while(a>0)
	{
	revA = revA*10;
	revA = revA +  a%10;
	a = a/10;
	}

	while(b>0)
        {
        revB = revB*10;
        revB = revB +  b%10;
        b = b/10;
        }

	revS = revA+revB;

	while(revS>0)
        {
        sum = sum*10;
        sum = sum +  revS%10;
        revS = revS/10;
        }
	
	printf("%d",sum);
	cases--;
	}
return 0;
}

