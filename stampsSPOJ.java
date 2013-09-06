import java.io.*;
import java.util.*;

class stampsSPOJ {
        public static void main(String args[]) throws IOException
        {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String str = in.readLine();
	int test = Integer.parseInt(str);

	List<Integer> c = new ArrayList<Integer>();

	for(int i=1; i<=test; i++)
	{
	String st = in.readLine();
	long cust = Long.parseLong(st.split(" ")[0]);
	int frnd = Integer.parseInt(st.split(" ")[1]);

	String s = in.readLine();
	
	for(int j=0; j<frnd; j++)
	{
	c.add(Integer.parseInt(s.split(" ")[j]));
	}
	
	Collections.sort(c);
	Collections.reverse(c);

	long sum=0;
	int u=0;

	for(int k=0; k<c.size(); k++)
	{
	sum+=c.get(k);
	if(sum>=cust)
	{
	u=k+1;	
	break;
	}
	
	}
	
	System.out.println("Scenario #"+i+":");
	if(u==0)
	{
	System.out.println("impossible");
	}
	else
	{
	System.out.println(u);
	}
	
	c.clear();
	}
}
}
