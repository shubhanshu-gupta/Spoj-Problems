/*#include<stdio.h>

int main()
	{
	
int n,i;
int a[10000];

	do{
		
	int i=0,j=0;

	scanf("%d",&n);
	
	if(n==0) 
	{
	return 0;
	}

	for(i=0; i<n; i++)
	{
	scanf("%d",&a[i]);
	}
	
	int cnt=0;

	for(i=0; i<n; i++)
	{
	if(a[a[i]-1]==i+1)
	{
	cnt++;
	}
	}
	
	if(cnt==n)
	{
	printf("ambiguous\n");
	}
	else
	{
	printf("not ambiguous\n");
	}
	}while(n!=0);

return 0;

int cnt;

while(scanf("%d", &n)==1 && n)
	{
		for(i=0; i<n; i++) scanf("%d", &a[i]);
		for(i=0, cnt=0; i<n; i++)
			if(a[a[i]-1]==i+1)
				cnt++;
		if(cnt==n) printf("ambiguous\n");
		else printf("not ambiguous\n");
	}
	return 0;

	}

*/


#include <stdio.h>

#define MAX 100001

int main()
{
	int a[MAX], n, i, cnt;
	while(scanf("%d", &n)==1 && n)
	{
		for(i=0; i<n; i++) scanf("%d", &a[i]);
		for(i=0, cnt=0; i<n; i++)
			if(a[a[i]-1]==i+1)
				cnt++;
		if(cnt==n) printf("ambiguous\n");
		else printf("not ambiguous\n");
	}
	return 0;
}
