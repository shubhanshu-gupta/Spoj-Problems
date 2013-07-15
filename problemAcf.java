//import java.util.*;
import java.io.*;

public class problemAcf {
	public static void main(String args[]) throws IOException
	{
	String s;

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();

	int test = Integer.parseInt(str);
	int[] n = new int[test];
	int[] k = new int[test];
	int count=0;
	int l=0;
	for(int i=0; i<test; i++)
	{
	
	s = in.readLine();
	n[i] = Integer.parseInt(s.split(" ")[0]);
	k[i] = Integer.parseInt(s.split(" ")[1]);		
	
	}
	
	for(int i=0; i<test; i++)
	{
	for(int j=0; j<test; j++)
	{
	if(n[i]==k[j]&&i!=j)
	{
	count=1;
	break;
	}
	}
	if(count==0)
	l++;
	count=0;
	}
	System.out.println(l);
	
}
}
