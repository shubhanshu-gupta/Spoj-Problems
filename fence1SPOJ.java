import java.io.*;

class fence1SPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
//	String str = in.readLine();	
//	int test;

	while(true)
	{
		int n = Integer.parseInt(in.readLine());
		double r,area;
	
		if(n!=0)
		{
		r = n/(Math.PI); 
		area = ((Math.PI)*r*r)/2;
		double num2 = (int)Math.round(area*100)/(double)100;
		System.out.println(num2);
		}
		else
		{
		break;
		}
	}
}
}
	
