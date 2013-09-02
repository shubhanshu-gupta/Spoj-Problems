import java.io.*;
import java.util.*;

class fashionSPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
	String str = in.readLine();
	int test = Integer.parseInt(str);
//	   int[] men = new int[n];
 //       int[] women = new int[n];
	
	int sum=0;

	for(int i=0; i<test; i++)
	{
		String s = in.readLine();
		int n = Integer.parseInt(s);
		ArrayList<Integer> men = new ArrayList<Integer>(1001);
		ArrayList<Integer> women = new ArrayList<Integer>(1001);


//	int[] men = new int[n];
//	int[] women = new int[n];	

//	String st;
//	String st1;

			String st = in.readLine();
			String st1 = in.readLine();

			for(int k=0; k<n; k++)
			{
			men.add(Integer.parseInt(st.split(" ")[k]));
			women.add(Integer.parseInt(st1.split(" ")[k]));
			}
			
			Collections.sort(men);
			Collections.sort(women);
			
//		System.out.println("//////"+men.get(k));
			
/*	for(int i=1; i<men.size(); i++)
	{
	int j;
	j=i;
	while(j>0 && (men.get(j)<men.get(j-1)))
	{
	int temp = men.get(j);
	men.get(j)=men.get(j-1);
	men.get(j-1)=temp;
	j--;
	}
	}
	
	for(int i=1; i<women.size(); i++)
        {
        int j;
        j=i;
        while(j>0 && (women.get(j)<women.get(j-1)))
        {
        int temp = women.get(j);
        women.get(j)=women.get(j-1);
        women.get(j-1)=temp;
        j--;
        }
        }
*/
	
	
			 for(int q=0; q<n; q++)
                        {
			sum += men.get(q)*women.get(q);
			}
	
		
	System.out.println(sum);
	sum=0;	

	}
}
}
	 
