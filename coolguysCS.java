import java.io.*;
import java.util.*;

class coolguysCS {
        public static void main(String args[]) throws IOException
        {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();

        int test = Integer.parseInt(str);
	
	for(int i=0; i<test; i++)
	{
	String st = in.readLine();
	
	long n = Long.parseLong(st);
	
	long tot = n*n;
	long sum=0;	

	for(int j=1; j<=n; j++)
	{
	sum += (n/j);
	}
	
	System.out.println(sum+"/"+tot);
	}
}
}
		
	

