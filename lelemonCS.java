import java.io.*;
import java.util.*;

class lelemonCS {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	int test = Integer.parseInt(str);
	List<Integer> c = new ArrayList<Integer>();
	StringTokenizer st;	
	List<Integer> c1 = new ArrayList<Integer>();

	for(int i=0; i<test; i++)
	{
	String st1 = in.readLine();
	
	int n = Integer.parseInt(st1.split(" ")[0]);
	int m = Integer.parseInt(st1.split(" ")[1]);
	
	String s = in.readLine();
	
	st = new StringTokenizer(s);
	int sum=0;


	while(st.hasMoreTokens())
	{
	c.add(Integer.parseInt(st.nextToken()));
	}	

	Collections.sort(c);
	
	for(int k=0; k<n; k++)
	{
	String s1 = in.readLine();
	
	int bottle = Integer.parseInt(s1.split(" ")[0]);

//	System.out.println("bottles////"+bottle);


	int l=1;
	while(l<=bottle)
	{
//	System.out.println("*****"+Integer.parseInt(s1.split(" ")[l]));


	c1.add(Integer.parseInt(s1.split(" ")[l]));
	l++;
	}
	Collections.sort(c1);
	
//	System.out.println("////"+Collections.max(c1));


	int room = c.get(0);	
	System.out.println("room"+room);	

	int num = Collections.frequency(c,room);
//	System.out.println("<<<<<<<"+num);

	for(int h=0; h<num; h++)
	{
	sum = sum + c1.get(c1.size()-1);
	c1.remove(c1.size()-1);
	c.remove(h);
	}
	}
	System.out.println(sum);
	}
}
}
