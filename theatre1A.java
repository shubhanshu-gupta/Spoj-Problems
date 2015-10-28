/* package whatever; // don't place package name! */

import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String args[]) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
/*		int[] i = new int[2];
		
		i[0] = Integer.parseInt(s[0]);
		i[1] = Integer.parseInt(s[1]);
		i[2] = Integer.parseInt(s[2]);
		
		int n = i[0];
		int m = i[1];
		int a = i[2];
		
		double out = Math.ceil(n/a)*Math.ceil(m/a);
*/

		long[] i = new long[3];
		
		i[0] = Integer.parseInt(s[0]);
		i[1] = Integer.parseInt(s[1]);
		i[2] = Integer.parseInt(s[2]);
		
		long n = i[0];
		long m = i[1];
		long a = i[2];
		
		long t = n/a;
		long t1 = m/a;
		
		if(n%a !=0) t++;
		if(m%a !=0) t1++;
		
		long out = t*t1;

		System.out.println(out);
		
	}
}