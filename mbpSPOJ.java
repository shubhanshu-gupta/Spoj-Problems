import java.io.*;
import java.util.*;

class mbpSPOJ {
    public static void main(String arg[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	int[] roll = new int[23];
	
	String str = in.readLine();	

	StringTokenizer st = new StringTokenizer(str);	
	int i=0;
	while(st.hasMoreTokens())
	{
	roll[i] = Integer.parseInt(st.nextToken());
	i++;
	}
	
	String s = in.readLine();
	int john = Integer.parseInt(s);
	
	int j=0,count=0;
	while(j<23)
	{	
	if(roll[j]==john)
	{
	count++;
	break;
	}
	else
	{
	j++;
	}
	}
	
	System.out.println(count*2 + " " + count);
	
}
}
