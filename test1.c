#include<stdio.h>

int main()
{
/*int c=5;
printf("%d %d %d",c,c<<2,c>> 2);
*/

/*int a[8][10], c=0,i,j;

for(i=0;i<10;i++)
{
for(j=0;j<8;j++)
{
a[j][i]=c++;}}
printf("%d",a[3][6]);
return 0;
*/

/*char *p,*q;
p=(char *)malloc(25);
q=(char*) malloc(25);
strcpy(p,"amazon" );
strcpy(q,"hyd");
strcat(p,q);
printf("%s",p);
*/

int i=5;
printf("%d",fun(fun(fun(fun( fun(i))))));
}
void fun(int i)
{ if(i%2) return (i+(7*4)-(5/2)+(2*2));
else return (i+(17/5)-(34/15)+(5/2));
}
