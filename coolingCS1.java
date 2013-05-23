import java.util.*;

class coolingCS1{
	public static void main(String args[])
	{
	
	Scanner in = new Scanner(System.in);

	int test;
	int count=0;

	test = in.nextInt();

	for(int t=0;t<test;t++)
	{
	int n = in.nextInt();
	
	int[] w = new int[n];
	int[] p = new int[n];	

	for(int i=0;i<n;i++)
	{
	  w[i] = in.nextInt();
	}
	
	for(int j=0;j<n;j++)
	{
	 p[j] = in.nextInt();
	}
	
	Arrays.sort(w);
	Arrays.sort(p);
	int c=0;
	int o = p.length-1;

	for(int l=w.length-1;l>=0;l--)
	{
	  if(w[l]<=p[o])
	{
	c++;
	o--;
	}
	}
	System.out.println(c);
	}
	}
}	
