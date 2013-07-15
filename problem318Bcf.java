import java.util.*;
import java.io.*;

public class problem318Bcf {
	public static void main(String args[]) throws IOException
	{
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      String str = in.readLine();
       // long n = Long.parseLong(str.split(" ")[0]);
      // long k = Long.parseLong(str.split(" ")[1]);

	
	str = str.replaceAll("heavy","1");
	str = str.replaceAll("metal","2");
	str = str.replaceAll("[a-z]","");
	
	int len = str.length();

	int[] metal = new int[len];
	int temp = 0;
	
	//int len = str.length();

	for(int i=len-1;i>=0; i--)
	{
	if(str.charAt(i)=='2')
	{
	metal[i] = temp + 1;
	temp++;
	}
	else
	{
	metal[i] = temp;
	}
	}

	long r=0;
	for(int j=0; j<metal.length; j++)
	{
	if(str.charAt(j)=='1')
	{
	r = r + metal[j];
	}
	}

	System.out.println(r);
	
}
}
