import java.io.*;

class eightsSPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String str = in.readLine();
	int test = Integer.parseInt(str);

	for(int i=0; i<test; i++)
	{
	String st = in.readLine();
	int n = Integer.parseInt(st);
	
	if(n==1)
	{
	System.out.println("192");
	}
	else
	{
	long sum = 192+(n-1)*250;
	System.out.println(sum);
	}
	}
}
}
