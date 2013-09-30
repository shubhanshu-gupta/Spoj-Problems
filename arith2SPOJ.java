import java.util.*;
import java.io.*;

class arith2SPOJ {
        public static void main(String args[]) throws IOException
        {
	
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 int test = Integer.parseInt(in.readLine());
	StringTokenizer st;
	List<String> c = new ArrayList<String>();

	for(int i=0; i<test; i++)
	{
	String s1 = in.readLine();
	
//	StringTokenizer st = new StringTokenizer();	

	String s2 = in.readLine();
	 st = new StringTokenizer(s2);
	

	while(st.hasMoreTokens())
	{
		c.add(st.nextToken());
	}
	
	for(int j=0; j<c.size(); j++)
	{
	System.out.println(c.get(j));
	}
	}
}
} 
	
