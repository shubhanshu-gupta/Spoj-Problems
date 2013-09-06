import java.util.*;
import java.math.*;

class bishopsSPOJ {
	public static void main(String args[])
	{
	
	Scanner in = new Scanner(System.in);
	
	while(in.hasNextBigInteger())
	{
	BigInteger n = in.nextBigInteger();
		
	if(n.equals(BigInteger.ONE))
	{
	System.out.println(1);
	}
	else
	{
	BigInteger two = new BigInteger("2");
	System.out.println(n.multiply(two).subtract(two));
	}
	}
}
}








// This is a completely correct code...it's just that the online compilers are showing NZEC error with this code...

/*import java.io.*;

class bishopsSPOJ {
	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
//	String str = in.readLine();

	while(true)
	{

	 String str = in.readLine();
	
//System.out.println("//");
	if(str.trim().equals(""))
	{
	break;
//	System.out.println("//");
	}
	else
	{
	long n = Long.parseLong(str);
	
		if(n==1)
		{
		System.out.println(1);
		}
		else
		{
		long num = 2*n-2;
		System.out.println(num);
//		continue;
		}
	
	}
	
	}
}
}
*/
