import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int i = Integer.parseInt(s);
		
		if(i==2)
		{
			System.out.println("NO");
		}
		else if(i%2 == 0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}