import java.io.*;
	
class fctrlSPOJ {
	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String str = in.readLine();

	int test = Integer.parseInt(str);
	
	for(int i=0; i<test; i++)
	{
		String s = in.readLine();
		long n = Long.parseLong(s);
	
		long sum=0;
		long num5=0;
		long num2=0;
		long five =5;

		
		while(n>0)
		{
		sum += (n/5);
		n /=5;
		}
		System.out.println(sum);

/*
		
		if(n==5)
		{
		System.out.println("1");
		}
		else
		{
		while(five<n)
		{
			num5 = num5 + (n/five);
			five = five*5;
		}

		long two = 2;
	
		while(two<n)
		{
			num2 = num2 + (n/two);
			two = two*2;
		}
	
		System.out.println(Math.min(num2,num5));
		}
*/	
	}
	}
}
