import java.io.*;
import java.util.*;

class integCS {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String str = in.readLine();
	
	int n = Integer.parseInt(str);
	
//	List<Integer> c1 = new ArrayList<Integer>(n+1);
	
	int[] c = new int[n];

	
	String s = in.readLine();
	int flg =0;

	for(int i=0; i<n; i++)
	{
//	c.add(Integer.parseInt(s.split(" ")[i]));
	
	c[i] = Integer.parseInt(s.split(" ")[i]); 	
	
	if(c[i]<0)
	{
	flg = i;
	}
	
	}
	
	flg = flg+1;
	
//	Collections.sort(c);

	Arrays.sort(c);

	String s1 = in.readLine();
	int x = Integer.parseInt(s1);
	
	if(flg<x)
	{
		int tot =0;

		for(int k=0; k<flg; k++)
		{
	//	tot += c.get(k);
		tot += c[k];
		}
		tot = (-1)*tot;
		System.out.println(tot);
	}
	else if(x==0)
	{
	System.out.println(0);
	}
	else
	{
		int total =0;
//		int su = ((-1)*c.get(x))*x;

		int su = ((-1)*c[x])*x;	

		for(int h=0; h<x; h++)
		{
//		total += (c.get(h)-c.get(x));
		total += (c[h]-c[x]);

		}
		total = (-1)*total;
		System.out.println(total+su);
	}
}
}
