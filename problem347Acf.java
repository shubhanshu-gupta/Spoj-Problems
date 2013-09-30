import java.io.*;
import java.util.*;

public class problem347Acf {
		public static void main(String args[]) throws IOException
		{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String s = in.readLine();
		int n = Integer.parseInt(s);
		int[] arr = new int[n];
		String str = in.readLine();

		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}

		Arrays.sort(arr);

		System.out.print(arr[n-1]+" ");

		for(int j=1; j<n-1; j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println(arr[0]);
		}
}
