import java.io.*;
import java.util.*;

public class problem334Acf {
	public static void main(String args[]) throws IOException
	{

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	int n = Integer.parseInt(str);

	int bro = n*n;
	int k=1;
	int j;
	for(int i=1; i<=n; i++)
	{
	
	for(j=1; j<=n/2; j++)
	{

	System.out.print(k++ + " " + bro-- + " ");
	
	}
	System.out.println();
//	k = j;
	}
}
}
	
