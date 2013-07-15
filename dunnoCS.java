import java.io.*;
import java.util.*;

class dunnoCS {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String str = in.readLine();
	int test = Integer.parseInt(str);
	StringTokenizer st;
	int[] arr = new int[3];

	for(int i=0; i<test; i++)
	{
	st = new StringTokenizer(in.readLine());
	
	
	
	int l=0;
	while(st.hasMoreTokens())
	{
	arr[l] = Integer.parseInt(st.nextToken());
	l++;
	}
	}
	
	for(int j=0; j<3; j++)
	{
	System.out.println(arr[j]);
	}

}
}
