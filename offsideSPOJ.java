import java.io.*;
import java.util.*;

class offsideSPOJ {
	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
//	String str = in.readLine();
	
	while(true)
	{
	 String str = in.readLine();
	
	int a = Integer.parseInt(str.split(" ")[0]);
	int d = Integer.parseInt(str.split(" ")[1]);
	
	if(a==0&&d==0)
	{
	break;
	}
	else
	{
	
		//int[] b = new int[a];
		List<Integer> c1 = new ArrayList<Integer>();

		List<Integer> c = new ArrayList<Integer>();
				
		String st = in.readLine();
		
		for(int i=0; i<a; i++)
		{
		c1.add(Integer.parseInt(st.split(" ")[i]));
		}
		
		String st1 = in.readLine();

		for(int j=0; j<d; j++)
                {
                c.add(Integer.parseInt(st1.split(" ")[j]));
                }

		Collections.sort(c1);
		Collections.sort(c);
		

		if(c.get(0)<=c1.get(0)&&c.get(1)<=c1.get(0))
		{
		System.out.println("N");
		}
		else
		{System.out.println("Y");}
	
	c.clear();
	c1.clear();
	}
	
	}
}
}	
