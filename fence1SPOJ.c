#include<stdio.h>
#include<math.h>

int main()
	{
	int n;
	double a,r;

	while(1)
	{
	scanf("%d",&n);
	
	if(n!=0)
	{
	r = n/(2*acos(0));
	a = (2*acos(0)*r*r)/2;
	printf("%.2f\n",a);
	}
	else
	{
	break;
	}
	}
return 0;
}
