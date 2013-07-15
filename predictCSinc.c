#include<stdio.h>

int main()
{
	int test;
	scanf("%d",&test);
	int i;	
	for(i=0; i<test; i++)
	{
	double prob;
	scanf("%lf",&prob);
	
//	  double max[100001];
        double pro = 1-prob;
        double m=0;
	int j;
 
	
        if((prob*(1+(2*pro))) > (pro*(1+(2*prob))))
        {
        m = (prob*(1+(2*pro)))*10000;
        }
        else
        {
        m = (pro*(1+(2*prob)))*10000;
        }


/*
       for(j=0;j<=10000;j++) 
        {
        max[j] = (((2*pro*j)+j)*prob) + ((10000-j)*prob*2*pro);
    
        if(max[j]>m)
        {
        m=max[j]; 
        }
        } 
*/
	printf("%lf\n",m);

        }
return 0;
}



