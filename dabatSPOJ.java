import java.io.*;
import java.util.*;

class dabatSPOJ {
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();

		int n = Integer.parseInt(str.split(" ")[0]);
		long d = Long.parseLong(str.split(" ")[1]);

		long[] bats = new long[n];

		int i=0;

		while(i<n)
		{
		bats[i++] = Long.parseLong(in.readLine());
		}

		Arrays.sort(bats);
		
		i=0;
		long pairs =0;
		
		while(i<n-1)
		{
			if(bats[i+1]-bats[i]<=d)
			{
				i=i+2;
				pairs++;
			}
			else
			{
				i++;
			}
		}

		System.out.println(pairs);
	}
}
