import java.io.*;
import java.util.*;

 class 318problemAcf {
	public static void main(String args[])
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();

	int n = Integer.parseInt(str.split(" ")[0]);
	int k = Integer.parseInt(str.split(" ")[1]);

	ArrayList<int> even = new ArrayList<int>();
	ArrayList<int> odd = new ArrayList<int>();
	ArrayList<int> list = new ArrayList<int>();

	for(int i=1; i<=n; i++)
	{
		if(i%2!=0)
		{
		odd.add(i);
		}
		else
		{
		even.add(i);
		}
	}
	
	int oddsize = odd.size();
	int evensize = even.size();
			
	for(int j=0; j<oddsize; j++)
	{
	list.add(odd.get(j));
	}
	for(int k=oddsize; k<n; k++)
	{
	list.add(even.get(k));
	}	
	

	for(int i=0; i<n; i++)
	{
	System.out.println(list.get(i));
	}



	
}
}
