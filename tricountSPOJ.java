import java.util.*;

class tricountSPOJ {
	public static void main(String args[]) 
	{
	
	Scanner in = new Scanner(System.in);
	int test1 = in.nextInt();

	for(int i=0; i<test1; i++)
	{
	long n = in.nextLong();
	long sum=0;

	if(n%2==0)
	{
	sum = (n*(n+2)*(2*n+1))/8;
	}
	else
	{
	sum = (n*(n+2)*(2*n+1)-1)/8;
	}
	
	System.out.println(sum);
	}
}
}	
