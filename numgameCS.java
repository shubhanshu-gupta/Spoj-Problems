//import java.util.*;
import java.io.*;

class numgameCS {
	public static void main(String args[]) throws IOException
		{

//	Scanner in = new Scanner(System.in);
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
       int test = Integer.parseInt(str);


	
	int j,count=0;
//	int test = in.nextInt();
	
	String[] n = new String[test];
	int[] num = new int[test];

	for(int i=0; i<test; i++)
	{
	n[i] = in.readLine();
	num[i] = Integer.parseInt(n[i]);	
	

/*	for(j=1; j<num[i]; j++)
	{
		if(num[i]==1)
                {
                count=1;
                }

		else if(num[i]%j==0)
		{
		num[i]=num[i]-j;
		count++;
		}
	}
*/	
	if(num[i]%2 != 0)
	{
	System.out.println("BOB");
	}
	else
	{
	System.out.println("ALICE");
	}
	}
}
}
