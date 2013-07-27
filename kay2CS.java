import java.util.*;
	
	class kay2CS{
	
	public static void main (String []args)
	{
	
	Scanner in=new Scanner (System.in);
	long t=in.nextLong ();
	kay2CS o=new kay2CS ();
	
	for (long q=1;q<=t;q++)
	{
 
	long n=in.nextLong ();
	long sq=(long)Math.sqrt (n);
 
	int flag=0;
 
	if (n==1)
	{
	flag=1;
	System.out.println (2);
	}
 
 
	if (flag==0)
	{
	for (long i=2;i<=2*sq+1;i++)
	{
	 
	if (o.pallin (n,i))
	{
	flag=1;
	System.out.println (i);
	break;
	}
 
	}
	}
		if (flag==0)
		{
	for (long j=sq;j>=2;j--)
	   {
		if (n%j==0)
		{
		flag=1;
		System.out.println (n/j-1);
		break;
		}
	   }
		}
		if (flag==0)
		{
		System.out.println (n-1);
		}
	}
	}
	 
	boolean pallin (long num, long b)
	{
	 
	long r=0;
	for (long j=num;j!=0;j/=b)
	{
	long c=j%b;
	r=r*b+c;
	}
	return (r==num);
}
}
 
