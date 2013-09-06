#include<stdio.h>
//#include<algorithm>

//using namespace std;

int main()
	{
	
	int test,i;

	scanf("%d",&test);
	
	for(i=1; i<=test; i++)
	{
	
	int tar, frnd,j;

	scanf("%d %d",&tar,&frnd);

	int arr[frnd];

	for(j=0; j<frnd; j++)
	{
	scanf("%d", &arr[j]);
	}

	sort(arr,arr+frnd);
	
	int sum=0;

	for(j=frnd-1; j>=0; j--)
	{
	sum+=arr[j];
	if(sum>=tar)
	{
	break;
	}
	}
	
	printf("Scenario #%d:\n",i);
	if(sum>=tar)
	{
	printf("%d\n",j);
	}
	else
	{
	printf("impossible");
	}
	}
return 0;
}
