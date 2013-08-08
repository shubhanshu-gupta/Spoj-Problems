import java.io.*;
import java.math.BigInteger;

class fctrl2SPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	
	int test = Integer.parseInt(str);
	
	for(int i=0; i<test; i++)
	{
	BigInteger fact = BigInteger.valueOf(1);
	
	int n = Integer.parseInt(in.readLine());
	
	for(int j=2; j<=n; j++)
	{
	fact = fact.multiply(BigInteger.valueOf(j));
	}
	
	System.out.println(fact);
	}
}
}	
