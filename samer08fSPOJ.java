import java.io.*;

class samer08fSPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int n;

	while((n=Integer.parseInt(in.readLine()))!=0)
	{

//	String s = in.readLine();
//	int n = Integer.parseInt(s);
	int sum=0;
	for(int i=1; i<=n; i++)
	{
	sum = sum + i*i;
	}
	System.out.println(sum);
	
	}
}
}	
