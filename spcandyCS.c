#include<stdio.h>

int main()
	{
	int test;
	int n,k;
	scanf("%d",&test);

	int i,num,j=1;
	long int sum=1;
	
	while(j<=33){
            sum=sum*num;
            j++;
  	}
	sum = sum-1;

	for(i=0; i<test; i++)
	{
	scanf("%d %d", &n, &k);
	
	printf("%d//// %d",n,k);

	if(n>=0&&k<=sum)
	{
	int teach = n%k;
        int stu = n/k;

        printf("%d %d\n",stu,teach);

        }
	else
        {

           printf("0 0\n");
        }
	}

return 0;	
	}

