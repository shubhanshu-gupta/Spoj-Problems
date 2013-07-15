import java.io.*;
import java.util.*;

class amsgame1CS {
	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;	
	String str = in.readLine();
	int test = Integer.parseInt(str);
//	int[] arr={0};
//	int size=0;

	for(int i=0; i<test; i++)
	{
	String str1 = in.readLine();
	int n = Integer.parseInt(str1);
	int[] arr = new int[n];
	int size = arr.length;
	int x;
	//StringTokenizer st = new StringTokenizer(str);

//	String s = in.readLine();
	
	st = new StringTokenizer(in.readLine());
	
//	x = Integer.parseInt(st.nextToken());
	int j=0;
	while(st.hasMoreTokens())
	{
	arr[j] = Integer.parseInt(st.nextToken());
	j++;
	}

	
	
	

	int g = arr[0];
	for(int h=1; h<size; h++)
	{
	g = findGCD(g,arr[h]);
	}
	System.out.println(g);
	
	}
	}
	
public static int findGCD(int number1, int number2)
	{
	if(number2 == 0)
	{
	return number1;
	}
	return findGCD(number2, number1%number2); 
	}

}
